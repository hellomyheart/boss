package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.config.RedisKeyConfig;
import com.example.boss.dto.InterviewDto;
import com.example.boss.dto.RecruitDto;
import com.example.boss.entity.Interview;
import com.example.boss.entity.Recruit;
import com.example.boss.entity.RecruitLog;
import com.example.boss.mapper.InterviewMapper;
import com.example.boss.mapper.RecruitLogMapper;
import com.example.boss.mapper.RecruitMapper;
import com.example.boss.service.RecruitLogService;
import com.example.boss.service.RecruitService;
import com.example.boss.third.JedisUtil;
import com.example.boss.util.TokenUtil;
import com.example.boss.vo.ResponseResult;
import com.github.pagehelper.PageHelper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitMapper recruitMapper;

    @Autowired
    private InterviewMapper interviewMapper;

    @Autowired
    private RecruitLogMapper recruitLogService;

    @Override
    @Transactional
    public ResponseResult sendResume(String token,RecruitDto recruit) {
        //从token中获取HR的id
        int hid = TokenUtil.getUid(token);
        Recruit recruit1 = new Recruit(recruit.getP_id(),recruit.getNum(),recruit.getAddress(),new Date(),new Date());
        recruit1.setId(0);
        int insert = recruitMapper.insert(recruit1);
        if(insert != 0){
            //发送招聘成功，插入日志
            RecruitLog recruitLog = new RecruitLog(hid,hid+"发布了招聘信息",1,new Date());
            recruitLog.setId(0);
            recruitLogService.insert(recruitLog);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult invited(InterviewDto interviewDto) {
        //TODO 获取HR和求职者ID
        Interview interview = new Interview(1,1,interviewDto.getAddress(),interviewDto.getI_time(),interviewDto.getStatus());
        interview.setId(0);
        interviewMapper.updateById(interview);
        return ResponseResult.ok();
    }

    @Override
    @Transactional
    public ResponseResult modifyRecruit(String token,Integer id,RecruitDto recruitDto) {
        int uid = TokenUtil.getUid(token);
        Recruit recruit1 = new Recruit(id,recruitDto.getP_id(),recruitDto.getNum(),recruitDto.getAddress(),new Date());
        if(recruitMapper.updateById(recruit1) > 0){
            RecruitLog recruitLog = new RecruitLog(uid, uid + "修改了招聘信息", 1, new Date());
            recruitLogService.insert(recruitLog);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    @Transactional
    public ResponseResult deleteRecruit(String token,Integer id) {
        int uid = TokenUtil.getUid(token);
        if(recruitMapper.deleteById(id) > 0){
            RecruitLog recruitLog = new RecruitLog(uid, uid + "删除了招聘信息", 1, new Date());
            recruitLogService.insert(recruitLog);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult selectAllRecruitByCompany(Integer page,Integer limit,Integer id) {
        PageHelper.startPage(page,limit);
        List<Recruit> list = recruitMapper.selectAllRecruitByCompany(id);
        return ResponseResult.ok(list);
    }


}

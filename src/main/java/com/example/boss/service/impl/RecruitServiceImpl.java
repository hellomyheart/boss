package com.example.boss.service.impl;

import com.example.boss.dto.InterviewDto;
import com.example.boss.dto.RecruitDto;
import com.example.boss.entity.Interview;
import com.example.boss.entity.Recruit;
import com.example.boss.mapper.InterviewMapper;
import com.example.boss.mapper.RecruitMapper;
import com.example.boss.service.RecruitService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitMapper recruitMapper;

    @Autowired
    private InterviewMapper interviewMapper;

    @Override
    public ResponseResult sendResume(RecruitDto recruit) {
        Recruit recruit1 = new Recruit(recruit.getP_id(),recruit.getNum(),recruit.getAddress(),new Date(),new Date());
        recruit1.setId(0);
        int insert = recruitMapper.insert(recruit1);
        if(insert != 0){
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
    public ResponseResult modifyResume(Integer id,RecruitDto recruitDto) {
        Recruit recruit1 = new Recruit(id,recruitDto.getP_id(),recruitDto.getNum(),recruitDto.getAddress(),new Date());
        if(recruitMapper.updateById(recruit1) > 0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}

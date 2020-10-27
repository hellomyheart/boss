package com.example.boss.service.impl;

import com.example.boss.dto.ResumeDto;
import com.example.boss.entity.Resume;
import com.example.boss.entity.User;
import com.example.boss.mapper.ResumeMapper;
import com.example.boss.mapper.UserMapper;
import com.example.boss.service.ResumeService;
import com.example.boss.util.TokenUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 21:26
 * @Description:
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeMapper dao;


    /**
     * 上传简历
     * @param token
     * @param
     * @return
     */
    @Override
    public ResponseResult add(String token, String address) {
        //获取当前登录用户id
        int uid = TokenUtil.getUid(token);
        //实例化简历对象
        ResumeDto resumeDto = new ResumeDto(uid, address, new Date());
        //插入简历
        if (dao.insertDto(resumeDto)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    /**
     * 查询简历
     * @param token
     * @return
     */
    @Override
    public ResponseResult select(String token) {
        //获取id
        int uid = TokenUtil.getUid(token);

        return ResponseResult.ok(dao.selectById(uid));
    }

    /**
     * 修改简历
     * @param token
     * @param address
     * @return
     */
    @Override
    public ResponseResult update(String token, String address) {
        //获取id
        int uid = TokenUtil.getUid(token);
        //更改面试地址
        if (dao.updateAddById(uid,address)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}

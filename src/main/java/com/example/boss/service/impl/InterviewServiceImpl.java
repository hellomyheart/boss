package com.example.boss.service.impl;

import com.example.boss.entity.Interview;
import com.example.boss.entity.User;
import com.example.boss.mapper.InterviewMapper;
import com.example.boss.mapper.UserMapper;
import com.example.boss.service.InterviewService;
import com.example.boss.util.TokenUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 22:43
 * @Description:
 */
@Service
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewMapper dao;


    /**
     * 接受面试
     * @param token
     * @return
     */
    @Override
    public ResponseResult updateYes(String token) {
        //获取用户id
        int uid = TokenUtil.getUid(token);
        //根据用户id更改面试状态
        if (dao.updateYById(uid)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    /**
     * 拒绝面试
     * @param token
     * @return
     */
    @Override
    public ResponseResult updateNo(String token) {
        //获取用户id
        int uid = TokenUtil.getUid(token);
        //根据用户id更改面试状态
        if (dao.updateNById(uid)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}


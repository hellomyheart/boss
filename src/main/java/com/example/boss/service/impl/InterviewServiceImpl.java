package com.example.boss.service.impl;

import com.example.boss.entity.Interview;
import com.example.boss.mapper.InterviewMapper;
import com.example.boss.service.InterviewService;
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
     * 登录完成后
     * 根据登录用户id更改面试表
     * @param interview
     * @return
     */
    @Override
    public Object update(Interview interview) {
        dao.updateSById(interview);
        return ResponseResult.ok();
    }
}

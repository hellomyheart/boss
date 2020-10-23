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


    @Override
    public ResponseResult update(int id) {
        //int a=1;
       // id=a;
        dao.updateSById(1);
        return ResponseResult.ok();
    }
}

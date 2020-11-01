package com.example.boss.service.impl;

import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.InterviewMapper;
import com.example.boss.entity.Interview;
import com.example.boss.service.InterviewService;
@Service
public class InterviewServiceImpl extends ServiceImpl<InterviewMapper, Interview> implements InterviewService{
    @Autowired
    private InterviewMapper dao;

    @Override
    public ResponseResult ok() {
        int id=1;
        Interview interview = new Interview(id, 2);
        if (dao.updateById(interview)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult no() {
        int id=1;
        Interview interview = new Interview(id, 5);
        if (dao.updateById(interview)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}

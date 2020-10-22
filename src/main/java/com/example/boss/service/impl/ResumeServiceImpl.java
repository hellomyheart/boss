package com.example.boss.service.impl;

import com.example.boss.entity.Resume;
import com.example.boss.mapper.ResumeMapper;
import com.example.boss.service.ResumeService;
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

    @Override
    public ResponseResult add(Resume resume) {
        Resume resume1 = new Resume(1, "郑州市", new Date());
        dao.insert(resume1);
        return ResponseResult.ok();
    }
}

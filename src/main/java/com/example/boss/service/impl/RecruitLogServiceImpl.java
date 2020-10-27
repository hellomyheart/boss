package com.example.boss.service.impl;

import com.example.boss.mapper.RecruitLogMapper;
import com.example.boss.service.RecruitLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruitLogServiceImpl  implements RecruitLogService {

    @Autowired
    private RecruitLogMapper recruitLogService;


}

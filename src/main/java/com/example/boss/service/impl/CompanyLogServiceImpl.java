package com.example.boss.service.impl;

import com.example.boss.mapper.CompanyLogMapper;
import com.example.boss.service.CompanyLogService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/27 15:24
 * @Description:
 */
@Service
public class CompanyLogServiceImpl implements CompanyLogService {
    @Autowired
    private CompanyLogMapper mapper;
    @Override
    public ResponseResult queryAll() {
        return ResponseResult.ok(mapper.selectList(null));
    }
}

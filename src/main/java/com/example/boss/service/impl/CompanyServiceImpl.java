package com.example.boss.service.impl;

import com.example.boss.dto.CompanyDto;
import com.example.boss.entity.Company;
import com.example.boss.mapper.CompanyMapper;
import com.example.boss.service.CompanyService;
import com.example.boss.util.TokenUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/24 19:25
 * @Description:
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper mapper;


    @Override
    public ResponseResult add(String token, CompanyDto dto) {
        int uid = TokenUtil.getUid(token);
        Company company = new Company(uid, dto.getName(), dto.getAddress(), dto.getDecription(), 1, new Date());
        mapper.add(company);
        return ResponseResult.ok();
    }
}

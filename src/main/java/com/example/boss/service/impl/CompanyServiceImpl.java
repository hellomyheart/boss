package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.dto.CompanyDto;
import com.example.boss.dto.CompanyUpdateDto;
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
        mapper.insert(company);
        return ResponseResult.ok();
    }

    @Override
    public ResponseResult update(Integer id, CompanyUpdateDto dto) {
        Company company = new Company(id, dto.getUid(), dto.getAddress(), dto.getDecription(), dto.getName(),1, new Date());
        if (mapper.updateById(company)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult query(int id) {
        return ResponseResult.ok(mapper.selectById(id));
    }

    @Override
    public ResponseResult delete(Integer id) {
        Company company = new Company(id, 2);
        if (mapper.updateById(company)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

}

package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.dto.CompanyDto;
import com.example.boss.dto.CompanyUpdateDto;
import com.example.boss.entity.Company;
import com.example.boss.entity.CompanyLog;
import com.example.boss.mapper.CompanyLogMapper;
import com.example.boss.mapper.CompanyMapper;
import com.example.boss.service.CompanyService;
import com.example.boss.util.TokenUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Autowired
    private CompanyLogMapper logMapper;


    @Override
    @Transactional
    public ResponseResult add(String token, CompanyDto dto) {
        int uid = TokenUtil.getUid(token);
        Company company = new Company(uid, dto.getName(), dto.getAddress(), dto.getDecription(), 1, new Date());
        if (mapper.insert(company)>0) {
            //记录日志
            CompanyLog companyLog = new CompanyLog(uid, uid + "添加公司", new Date(), 1);
            logMapper.insert(companyLog);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    @Transactional
    public ResponseResult update(Integer id, String token,CompanyUpdateDto dto) {
        int uid = TokenUtil.getUid(token);
        Company company = new Company(id, uid, dto.getAddress(), dto.getDecription(), dto.getName(),1, new Date());
        if (mapper.updateById(company)>0) {
            //记录日志
            CompanyLog companyLog = new CompanyLog(uid, uid+ "修改公司信息", new Date(), 1);
            logMapper.insert(companyLog);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult query(int id) {
        return ResponseResult.ok(mapper.selectById(id));
    }

    @Override
    @Transactional
    public ResponseResult delete(Integer id,String token) {
        int uid = TokenUtil.getUid(token);
        Company company = new Company(id, 2);
        if (mapper.updateById(company)>0) {
            //记录日志
            CompanyLog companyLog = new CompanyLog(uid,uid + "删除公司", new Date(), 1);
            logMapper.insert(companyLog);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

}

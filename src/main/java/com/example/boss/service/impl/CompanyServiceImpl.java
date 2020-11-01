package com.example.boss.service.impl;

import com.example.boss.dto.CompanyDto;
import com.example.boss.entity.UserLog;
import com.example.boss.mapper.UserLogMapper;
import com.example.boss.util.TokenUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.entity.Company;
import com.example.boss.mapper.CompanyMapper;
import com.example.boss.service.CompanyService;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService{
    @Autowired
    private CompanyMapper mapper;
    @Autowired
    private UserLogMapper logMapper;

    @Override
    @Transactional
    public ResponseResult save(String token, CompanyDto dto) {
        int uid = TokenUtil.getUid(token);
        Company company = new Company(uid, dto.getName(), dto.getAddress(), dto.getDecription(), 1, new Date(),new Date());
        if (mapper.insert(company)>0) {
            //记录日志
            UserLog userLog = new UserLog(uid, new Date(), "add", uid+"添加公司");
            logMapper.insert(userLog);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    @Transactional
    public ResponseResult updateInfo(Integer id,String token, CompanyDto dto) {
        //获取id
        int uid = TokenUtil.getUid(token);
        Company company = new Company(id,uid, dto.getName(), dto.getAddress(), dto.getDecription(), new Date());
        if (mapper.updateById(company)>0){
            //记录日志
            UserLog userLog = new UserLog(uid, new Date(), "update", uid + "修改公司信息");
            logMapper.insert(userLog);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}

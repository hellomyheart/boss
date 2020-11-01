package com.example.boss.service;

import com.example.boss.dto.CompanyDto;
import com.example.boss.entity.Company;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boss.vo.ResponseResult;

public interface CompanyService extends IService<Company>{
    //添加公司
    ResponseResult save(String token, CompanyDto dto);

}

package com.example.boss.service;

import com.example.boss.dto.CompanyDto;
import com.example.boss.vo.ResponseResult;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/24 19:21
 * @Description:
 */
public interface CompanyService {

    ResponseResult add(String token, CompanyDto dto);

}

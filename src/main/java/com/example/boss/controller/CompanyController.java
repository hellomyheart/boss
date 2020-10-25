package com.example.boss.controller;

import com.example.boss.config.SystemConfig;
import com.example.boss.dto.CompanyDto;
import com.example.boss.dto.CompanyUpdateDto;
import com.example.boss.service.CompanyService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/24 19:30
 * @Description:
 */
@RestController
@RequestMapping("/company/")
public class CompanyController {
    @Autowired
    private CompanyService service;

    /**
     * 添加公司
     * @param token
     * @param dto
     * @return
     */
    @PostMapping("add")
    public ResponseResult add(String token, CompanyDto dto){
        return service.add(token,dto);
    }

    /**
     * 修改公司信息
     * @param id
     * @param dto
     * @return
     */
    @PostMapping("update")
    public ResponseResult update(Integer id, CompanyUpdateDto dto){
        return service.update(id, dto);
    }

    /**
     * 浏览公司信息
     * @param id
     * @return
     */
    @PostMapping("detail.do")
    public ResponseResult detail(int id){
        return service.query(id);
    }
}

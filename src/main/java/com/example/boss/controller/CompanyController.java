package com.example.boss.controller;

import com.example.boss.config.SystemConfig;
import com.example.boss.dto.CompanyDto;
import com.example.boss.service.CompanyService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/11/1 15:19
 * @Description:
 */
@RestController
@RequestMapping("/company/")
public class CompanyController {
    @Autowired
    private CompanyService service;

    /**
     * 添加公司
     * @param request
     * @param dto
     * @return
     */
    @PostMapping("save")
    public ResponseResult save(HttpServletRequest request, CompanyDto dto){
        return service.save(request.getHeader(SystemConfig.TOKEN_HEADER),dto);
    }

    /**
     * 修改公司信息
     * @param request
     * @param dto
     * @return
     */
    @PostMapping("update")
    public ResponseResult update(Integer id,HttpServletRequest request,CompanyDto dto){
        return service.updateInfo(id,request.getHeader(SystemConfig.TOKEN_HEADER),dto);
    }
}

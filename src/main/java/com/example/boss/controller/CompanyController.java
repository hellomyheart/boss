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
     * @param request
     * @param dto
     * @return
     */
    @PostMapping("add")
    public ResponseResult add(HttpServletRequest request, CompanyDto dto){
        return service.add(request.getHeader(SystemConfig.TOKEN_HEADER),dto);
    }

    /**
     * 修改公司信息
     * @param id
     * @param dto
     * @return
     */
    @PostMapping("update")
    public ResponseResult update(Integer id,HttpServletRequest request, CompanyUpdateDto dto){
        return service.update(id,request.getHeader(SystemConfig.TOKEN_HEADER), dto);
    }

    /**
     * 浏览公司信息
     * @param id
     * @return
     */
    @PostMapping("detail")
    public ResponseResult detail(int id){
        return service.query(id);
    }

    /**
     * 删除公司
     * @param id
     * @return
     */
    @PostMapping("delete")
    public ResponseResult delete(Integer id,HttpServletRequest request){
        return service.delete(id,request.getHeader(SystemConfig.TOKEN_HEADER));
    }
}

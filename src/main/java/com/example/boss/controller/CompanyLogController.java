package com.example.boss.controller;

import com.example.boss.service.CompanyLogService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/27 15:24
 * @Description:
 */
@RestController
@RequestMapping("/companylog/")
public class CompanyLogController {
    @Autowired
    private CompanyLogService service;

    @PostMapping("query")
    public ResponseResult query(){
        return service.queryAll();
    }
}

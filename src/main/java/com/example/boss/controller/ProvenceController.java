package com.example.boss.controller;

import com.example.boss.service.ProvenceService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/31 11:14
 * @Description:
 */
@RestController
@RequestMapping("/provence")
public class ProvenceController {
    @Autowired
    private ProvenceService service;

    /**
     * 查询所有省
     * @return
     */
    @GetMapping("/findAll")
    public ResponseResult findAll(){
        return service.findAll();
    }
}

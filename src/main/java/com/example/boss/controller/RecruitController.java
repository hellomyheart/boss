package com.example.boss.controller;

import com.example.boss.service.RecruitService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 20:16
 * @Description:
 */
@RestController
@RequestMapping("/recruit")
public class RecruitController {
    @Autowired
    private RecruitService service;

    /**
     * 查询所有招聘信息
     * @return
     */
    @GetMapping("/selectAll")
    public ResponseResult selectAll(){
        return service.selectAll();
    }
}

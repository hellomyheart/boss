package com.example.boss.controller;

import com.example.boss.service.DistrictService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/31 14:07
 * @Description:
 */
@RestController
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private DistrictService service;

    /**
     * 查询区
     * @param id
     * @return
     */
    @GetMapping("/findAllDistrict")
    public ResponseResult findAllDistrict(int id){
        return service.findAllDistrict(id);
    }
}

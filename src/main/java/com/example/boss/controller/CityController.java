package com.example.boss.controller;

import com.example.boss.service.CityService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/31 11:33
 * @Description:
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService service;


    @GetMapping("/findAllCity")
    public ResponseResult findAllCity(int id){
        return service.findAllCity(id);
    }
}

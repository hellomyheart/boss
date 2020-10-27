package com.example.boss.controller;

import com.example.boss.dto.UserLogDto;
import com.example.boss.dto.UserLoginDto;
import com.example.boss.service.UserLogService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/27 14:22
 * @Description:
 */
@RestController
@RequestMapping("/userlog/")
public class UserLogController {
    @Autowired
    private UserLogService service;

    @PostMapping("save")
    public ResponseResult save(UserLogDto logDto){
        return service.add(logDto);
    }

    @PostMapping("query")
    public ResponseResult query(){
        return service.query();
    }
}

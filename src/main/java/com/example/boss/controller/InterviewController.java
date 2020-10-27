package com.example.boss.controller;

import com.example.boss.entity.Interview;
import com.example.boss.service.InterviewService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 22:43
 * @Description:
 */
@RestController
@RequestMapping("/interview")
public class InterviewController {
    @Autowired
    private InterviewService service;

    /**
     * 接受面试
     * @param
     * @return
     */
    @PutMapping("/updateYes")
    public ResponseResult updateYes(String token){
        service.updateYes(token);
         return ResponseResult.ok();
    }

    /**
     * 拒绝面试
     * @param token
     * @return
     */
    @PutMapping("/updateNo")
    public ResponseResult updateNo(String token){
        service.updateNo(token);
        return ResponseResult.ok();
    }
}

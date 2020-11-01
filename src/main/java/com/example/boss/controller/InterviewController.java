package com.example.boss.controller;

import com.example.boss.service.InterviewService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/11/1 23:39
 * @Description:
 */
@RestController
@RequestMapping("/interview")
public class InterviewController {
    @Autowired
    private InterviewService service;

    /**
     * 接受面试
     * @return
     */
    @PutMapping("/yes")
    public ResponseResult ok(){
        return service.ok();
    }

    /**
     * 拒绝面试
     * @return
     */
    @PutMapping("/no")
    public ResponseResult no(){
        return service.no();
    }
}

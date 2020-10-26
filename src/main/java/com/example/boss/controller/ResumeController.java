package com.example.boss.controller;

import com.example.boss.entity.Resume;
import com.example.boss.service.ResumeService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 21:26
 * @Description:
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    private ResumeService service;


    /**
     * 上传简历
     * @param token
     * @param resume
     * @return
     */
    @PostMapping("/add")
    public ResponseResult add(String token, Resume resume){

        return service.add(token,resume);
    }
}

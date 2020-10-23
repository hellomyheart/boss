package com.example.boss.controller;

import com.example.boss.dto.InterviewDto;
import com.example.boss.dto.RecruitDto;
import com.example.boss.service.RecruitService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    /**
     * 发布招聘信息
     * @param recruitDto
     * @return
     */
    @PostMapping("/sendResume")
    public ResponseResult sendResume(RecruitDto recruitDto){
        return recruitService.sendResume(recruitDto);
    }

    /**
     * 邀请面试
     * @param interviewDto 前端传入HR选择的面试信息
     * @return
     */
    @PostMapping("/invited")
    public ResponseResult invited(InterviewDto interviewDto){
        return recruitService.invited(interviewDto);
    }


}

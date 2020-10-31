package com.example.boss.controller;

import com.example.boss.service.ResumeService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/31 23:38
 * @Description:
 */
@RestController
@RequestMapping("/resume")
public class ResumeController {
    @Autowired
    private ResumeService service;

    /**
     * 上传简历(有bug)
     * @param file
     * @return
     * @throws IOException
     */
    @PutMapping("/insert")
    public ResponseResult insert(MultipartFile file) throws IOException {
        return service.sendResume(file);
    }
}

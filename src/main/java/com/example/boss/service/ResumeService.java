package com.example.boss.service;

import com.example.boss.entity.Resume;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boss.vo.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ResumeService extends IService<Resume>{

    /**
     * 上传简历
     *
     * @return
     */
    ResponseResult sendResume(MultipartFile file) throws IOException;
}

package com.example.boss.service;

import com.example.boss.entity.Resume;
import com.example.boss.vo.ResponseResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 21:26
 * @Description:
 */
public interface ResumeService {
    ResponseResult add(Resume resume);
}

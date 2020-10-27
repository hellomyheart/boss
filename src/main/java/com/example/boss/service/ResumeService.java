package com.example.boss.service;

import com.example.boss.dto.ResumeDto;
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
    /**
     * 上传简历
     * @param token
     * @param address
     * @return
     */
    ResponseResult add(String token, String address);

    /**
     * 查询简历
     * @param token
     * @return
     */
    ResponseResult select(String token);

    /**
     * 修改简历
     * @param token
     * @param address
     * @return
     */
    ResponseResult update(String token,String address);
}

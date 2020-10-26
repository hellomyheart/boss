package com.example.boss.service;

import com.example.boss.entity.Interview;
import com.example.boss.vo.ResponseResult;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 22:43
 * @Description:
 */
public interface InterviewService {

    /**
     * 接受面试/更改状态为2
     * @param token
     * @return
     */
    ResponseResult updateYes(String token);

    /**
     * 拒绝面试/更改状态为5
     * @param token
     * @return
     */
    ResponseResult updateNo(String token);
}

package com.example.boss.service;

import com.example.boss.entity.Interview;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boss.vo.ResponseResult;

public interface InterviewService extends IService<Interview>{

    /**
     * 接受面试
     * @return
     */
    ResponseResult ok();

    /**
     * 拒绝面试
     * @return
     */
    ResponseResult no();
}

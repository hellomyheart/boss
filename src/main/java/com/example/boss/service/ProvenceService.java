package com.example.boss.service;

import com.example.boss.entity.Provence;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boss.vo.ResponseResult;

import java.util.List;

//省表
public interface ProvenceService extends IService<Provence>{


    /**
     * 查询所有省
     * @return
     */
    ResponseResult findAll();


}

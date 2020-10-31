package com.example.boss.service;

import com.example.boss.entity.City;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boss.vo.ResponseResult;

public interface CityService extends IService<City>{

    /**
     * 根据省id查询所有市
     * @param id
     * @return
     */
    ResponseResult findAllCity(int id);


}

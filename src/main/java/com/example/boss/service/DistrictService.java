package com.example.boss.service;

import com.example.boss.entity.District;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boss.vo.ResponseResult;

//区表
public interface DistrictService extends IService<District>{

    /**
     * 根据市表查询曲表
     * @param id
     * @return
     */
    ResponseResult findAllDistrict (int id);

}

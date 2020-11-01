package com.example.boss.service;

import com.example.boss.dto.ApplyInfoDto;
import com.example.boss.dto.UserDto;
import com.example.boss.entity.Applyinfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boss.vo.ResponseResult;

public interface ApplyinfoService extends IService<Applyinfo>{
    //注册
    ResponseResult register(UserDto userDto, ApplyInfoDto dto);

}

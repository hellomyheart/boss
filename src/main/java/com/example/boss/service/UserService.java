package com.example.boss.service;

import com.example.boss.vo.ResponseResult;

/**
 * @description
 * @className: UserService
 * @package: com.example.dingding.service
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:54
 */
public interface UserService {
    //检查手机号是否可用
    ResponseResult checkPhone(String phone);
}


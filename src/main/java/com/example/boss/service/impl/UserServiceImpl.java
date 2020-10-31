package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.entity.User;
import com.example.boss.mapper.UserMapper;
import com.example.boss.service.UserService;
import com.example.boss.util.StrUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description
 * @className: UserServiceImpl
 * @package: com.example.dingding.service.impl
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:55
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public ResponseResult checkPhone(String phone) {
        if (StrUtil.checkNoEmpty(phone)) {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("phone",phone);
            if (mapper.selectOne(queryWrapper) != null) {
                //存在-手机号不可用
                return ResponseResult.fail();
            }else{
                //不存在-手机号可用
                return ResponseResult.ok();
            }
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult checkNickName(String nickname) {
        if (StrUtil.checkNoEmpty(nickname)) {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("nickname",nickname);
            if (mapper.selectOne(queryWrapper) != null) {
                //存在-昵称不可用
                return ResponseResult.fail();
            }else{
                //不存在-昵称可用
                return ResponseResult.ok();
            }
        }
        return ResponseResult.fail();
    }


}


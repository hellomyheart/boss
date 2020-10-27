package com.example.boss.service;

import com.example.boss.dto.UserLogDto;
import com.example.boss.entity.UserLog;
import com.example.boss.vo.ResponseResult;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/27 14:03
 * @Description:
 */
public interface UserLogService {

    ResponseResult add(UserLogDto logDto);
}

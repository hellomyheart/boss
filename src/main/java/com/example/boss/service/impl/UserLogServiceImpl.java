package com.example.boss.service.impl;

import com.example.boss.dto.UserLogDto;
import com.example.boss.entity.UserLog;
import com.example.boss.mapper.UserLogMapper;
import com.example.boss.service.UserLogService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/27 14:03
 * @Description:
 */
@Service
public class UserLogServiceImpl implements UserLogService {
    @Autowired
    private UserLogMapper mapper;


    @Override
    public ResponseResult add(UserLogDto logDto) {
        UserLog userLog = new UserLog(logDto.getUid(), logDto.getType(), new Date(), logDto.getStatus());
        if (mapper.insert(userLog)>0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult query() {
        return ResponseResult.ok(mapper.selectList(null));
    }
}

package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.UserLogMapper;
import com.example.boss.entity.UserLog;
import com.example.boss.service.UserLogService;
@Service
public class UserLogServiceImpl extends ServiceImpl<UserLogMapper, UserLog> implements UserLogService{

}

package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.entity.PositionLog;
import com.example.boss.mapper.PositionLogMapper;
import com.example.boss.service.PositionLogService;
@Service
public class PositionLogServiceImpl extends ServiceImpl<PositionLogMapper, PositionLog> implements PositionLogService{

}

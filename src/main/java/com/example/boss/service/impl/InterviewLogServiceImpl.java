package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.InterviewLogMapper;
import com.example.boss.entity.InterviewLog;
import com.example.boss.service.InterviewLogService;
@Service
public class InterviewLogServiceImpl extends ServiceImpl<InterviewLogMapper, InterviewLog> implements InterviewLogService{

}

package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.RecruitLogMapper;
import com.example.boss.entity.RecruitLog;
import com.example.boss.service.RecruitLogService;
@Service
public class RecruitLogServiceImpl extends ServiceImpl<RecruitLogMapper, RecruitLog> implements RecruitLogService{

}

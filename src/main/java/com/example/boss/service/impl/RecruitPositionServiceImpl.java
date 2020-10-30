package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.entity.RecruitPosition;
import com.example.boss.mapper.RecruitPositionMapper;
import com.example.boss.service.RecruitPositionService;
@Service
public class RecruitPositionServiceImpl extends ServiceImpl<RecruitPositionMapper, RecruitPosition> implements RecruitPositionService{

}

package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.RecruitMapper;
import com.example.boss.entity.Recruit;
import com.example.boss.service.RecruitService;
@Service
public class RecruitServiceImpl extends ServiceImpl<RecruitMapper, Recruit> implements RecruitService{

}

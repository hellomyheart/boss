package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.ApplyinfoMapper;
import com.example.boss.entity.Applyinfo;
import com.example.boss.service.ApplyinfoService;
@Service
public class ApplyinfoServiceImpl extends ServiceImpl<ApplyinfoMapper, Applyinfo> implements ApplyinfoService{

}

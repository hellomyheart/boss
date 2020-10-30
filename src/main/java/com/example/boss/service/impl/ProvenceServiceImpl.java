package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.entity.Provence;
import com.example.boss.mapper.ProvenceMapper;
import com.example.boss.service.ProvenceService;
@Service
public class ProvenceServiceImpl extends ServiceImpl<ProvenceMapper, Provence> implements ProvenceService{

}

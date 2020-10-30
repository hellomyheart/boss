package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.entity.Position;
import com.example.boss.mapper.PositionMapper;
import com.example.boss.service.PositionService;
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements PositionService{

}

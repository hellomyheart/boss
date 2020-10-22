package com.example.boss.service.impl;

import com.example.boss.dto.PositionDto;
import com.example.boss.entity.Position;
import com.example.boss.mapper.PositionMapper;
import com.example.boss.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: 张尚斌
 * @Time: 2020/10/22 20:33
 * @Description:
 */
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionMapper positionMapper;

    @Override
    public void add(PositionDto dto) {
        Position position = new Position(dto.getCid(),dto.getName(),dto.getDecription(),dto.getSkill(),dto.getSalary(),new Date(),new Date());
        positionMapper.insert(position);


    }

    @Override
    public void update(Position position) {

    }

    @Override
    public void delete(Integer id) {

    }
}
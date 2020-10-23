package com.example.boss.service.impl;

import com.example.boss.dto.PositionDto;
import com.example.boss.entity.Position;
import com.example.boss.mapper.PositionMapper;
import com.example.boss.service.PositionService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
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

    //@Override
    //public ResponseResult add(PositionDto dto) {
    //    PositionDto positionDto = new PositionDto(dto.getCid(),dto.getName(),dto.getDecription(),dto.getSkill(),dto.getSalary(),new Date());
    //    positionMapper.add(positionDto);
    //    return ResponseResult.ok();
    //
    //
    //}

    @Override
    public void update(Position position) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public ResponseResult addPosition(PositionDto dto) {
        Position position = new Position(dto.getCid(), dto.getName(), dto.getDecription(), dto.getSkill(), dto.getSalary(), new Date());
        positionMapper.add(position);
        return ResponseResult.ok();
    }
}
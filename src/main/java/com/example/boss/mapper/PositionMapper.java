package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.dto.PositionDto;
import com.example.boss.entity.Position;

/**
 * @ProjectName: boss
 * @Author: Zsh
 * @Time: 2020/10/22 20:25
 * @Description:
 */
public interface PositionMapper extends BaseMapper<Position> {

    int update(PositionDto dto);
}

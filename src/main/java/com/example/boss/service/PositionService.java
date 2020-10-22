package com.example.boss.service;

import com.example.boss.dto.PositionDto;
import com.example.boss.entity.Position;

/**
 * @ProjectName: boss
 * @Author: Zsh
 * @Time: 2020/10/22 20:27
 * @Description:
 */
public interface PositionService {
    /**
     * 添加职位信息
     * @param dto
     */
    public void add(PositionDto dto);

    /**
     * 修改职位信息
     * @param position
     */
    public void update(Position position);

    /**
     * 删除职位信息
     * @param id
     */
    public void delete(Integer id);

}

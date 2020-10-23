package com.example.boss.service;

import com.example.boss.dto.PositionDto;
import com.example.boss.entity.Position;
import com.example.boss.vo.ResponseResult;

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
     * @return
     */
    ResponseResult addPosition(PositionDto dto);

    /**
     * 添加职位信息
     * @param position
     * @return
     */
    public ResponseResult update(Position position);

    /**
     * 删除职位信息
     * @param id
     * @return
     */
    public ResponseResult delete(Integer id);


}

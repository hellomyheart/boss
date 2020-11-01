package com.example.boss.service;

import com.example.boss.dto.PositionDto;
import com.example.boss.dto.PositionUpdateDto;
import com.example.boss.entity.Position;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boss.vo.ResponseResult;

public interface PositionService {
    /**
     * 新增职位
     * @param dto
     * @return
     */
    ResponseResult add(PositionDto dto);

    ResponseResult update(PositionUpdateDto dto);

    ResponseResult delete(Integer id);

}

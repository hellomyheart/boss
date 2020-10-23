package com.example.boss.controller;

import com.example.boss.dto.PositionDto;
import com.example.boss.entity.Position;
import com.example.boss.service.PositionService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: 张尚斌
 * @Time: 2020/10/22 20:48
 * @Description:
 */
@RestController
@RequestMapping("/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @PostMapping("add")
    public ResponseResult add(@RequestBody PositionDto dto){
        return  positionService.addPosition(dto);
    }
}
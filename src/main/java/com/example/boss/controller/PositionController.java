package com.example.boss.controller;

import com.example.boss.dto.PositionDto;
import com.example.boss.dto.PositionUpdateDto;
import com.example.boss.entity.Position;
import com.example.boss.service.PositionService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: 张尚斌
 * @Time: 2020/10/31 15:36
 * @Description:
 */
@RestController
@RequestMapping("/position/")
public class PositionController {

    @Autowired
    PositionService positionService;
    @GetMapping("/add/")
    public ResponseResult add(PositionDto dto){
        return positionService.add(dto);
}
    @GetMapping("/update/")
    public ResponseResult update(PositionUpdateDto dto){
        return positionService.update(dto);
    }
    @PostMapping("delete")
    public ResponseResult delete(Integer id){
        return positionService.delete(id);
    }







}
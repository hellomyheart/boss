package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.dto.PositionDto;
import com.example.boss.dto.PositionUpdateDto;
import com.example.boss.entity.PositionLog;
import com.example.boss.mapper.PositionLogMapper;
import com.example.boss.third.JedisUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.entity.Position;
import com.example.boss.mapper.PositionMapper;
import com.example.boss.service.PositionService;
@Service
public class PositionServiceImpl  implements PositionService{
    @Autowired
    private PositionMapper positionMapper;
    @Autowired
    private PositionLogMapper positionLogMapper;



    @Override
    public ResponseResult add(PositionDto dto) {

        Position position = new Position();
        position.setCId(dto.getCid());
        position.setRiId(1);
        position.setName(dto.getName());
        position.setDecription(dto.getName());
        position.setSkill(dto.getSkill());
        position.setSalary(dto.getSalary());
        Date date = new Date();
        position.setCreatetime(date);
        position.setUpdatetime(date);
        position.setStatus("1");

        if (positionMapper.insert(position)>0){
            PositionLog positionLog = new PositionLog();
            positionLog.setUId(position.getRiId());
            positionLog.setCreatetime(new Date());
            positionLog.setType("1");
            positionLog.setDecription(position.getRiId() + "添加职位信息");

            positionLogMapper.insert(positionLog);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();


    }

    @Override
    public ResponseResult update(PositionUpdateDto dto) {
        Position position = new Position();
        position.setCId(dto.getCid());
        position.setRiId(1);
        position.setName(dto.getName());
        position.setDecription(dto.getName());
        position.setSkill(dto.getSkill());
        position.setSalary(dto.getSalary());
        Date date = new Date();
        position.setCreatetime(date);
        position.setUpdatetime(date);
        position.setStatus("1");

        if (positionMapper.update(position)>0){
            PositionLog positionLog = new PositionLog();
            positionLog.setUId(position.getRiId());
            positionLog.setCreatetime(new Date());
            positionLog.setType("1");
            positionLog.setDecription(position.getRiId() + "修改职位信息");

            positionLogMapper.insert(positionLog);
            return ResponseResult.ok();
        }
            return ResponseResult.fail();
    }

    @Override
    public ResponseResult delete(Integer id) {
        positionMapper.delete(id);


        return ResponseResult.ok();
    }
}

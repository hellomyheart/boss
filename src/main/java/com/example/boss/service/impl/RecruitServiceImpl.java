package com.example.boss.service.impl;

import com.example.boss.dto.RecruitDto;
import com.example.boss.entity.Recruit;
import com.example.boss.mapper.RecruitMapper;
import com.example.boss.service.RecruitService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitMapper recruitMapper;

    @Override
    public ResponseResult sendResume(RecruitDto recruit) {
        Recruit recruit1 = new Recruit(recruit.getP_id(),recruit.getNum(),recruit.getAddress(),new Date(),new Date());
        recruit1.setId(0);
        int insert = recruitMapper.insert(recruit1);
        if(insert != 0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}

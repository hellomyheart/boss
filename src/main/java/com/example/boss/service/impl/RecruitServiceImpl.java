package com.example.boss.service.impl;

import com.example.boss.dto.RecruitDto;
import com.example.boss.dto.RecruitDto2;
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
        RecruitDto2 recruit1 = new RecruitDto2(recruit.getP_id(),recruit.getNum(),recruit.getAddress(),new Date(),new Date());
        int insert = recruitMapper.insertDto(recruit1);
        if(insert != 0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}

package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.dto.FindByType;
import com.example.boss.dto.FindResultDto;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.RecruitMapper;
import com.example.boss.entity.Recruit;
import com.example.boss.service.RecruitService;
@Service
public class RecruitServiceImpl extends ServiceImpl<RecruitMapper, Recruit> implements RecruitService{
    @Autowired
    private RecruitMapper dao;


    @Override
    public ResponseResult selectAllByType(FindByType dto) {
        FindByType fbt = new FindByType(dto.getR_address(),dto.getC_name(),dto.getP_name());
        List<FindResultDto> list=dao.findByType(fbt);
        if (list!=null) {
            return ResponseResult.ok(list);
        }
        return ResponseResult.fail();
    }


}

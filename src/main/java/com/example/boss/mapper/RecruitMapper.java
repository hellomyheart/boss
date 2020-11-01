package com.example.boss.mapper;

import com.alibaba.druid.sql.visitor.functions.If;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.dto.FindByType;
import com.example.boss.dto.FindResultDto;
import com.example.boss.entity.Recruit;
import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RecruitMapper extends BaseMapper<Recruit> {

    List<FindResultDto> findByType(FindByType fbt);



}
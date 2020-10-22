package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.dto.RecruitAllDto;
import com.example.boss.entity.Recruit;
import org.apache.ibatis.annotations.Select;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 20:09
 * @Description:
 */
public interface RecruitMapper extends BaseMapper<Recruit> {

    RecruitAllDto selectAll(Object o);
}

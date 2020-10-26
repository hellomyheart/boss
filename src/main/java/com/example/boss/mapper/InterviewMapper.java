package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.entity.Interview;
import org.apache.ibatis.annotations.Update;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 22:43
 * @Description:
 */
public interface InterviewMapper extends BaseMapper<Interview> {
    @Update("update  interview  set status=2 where r_id=#{u_id}")
    int updateYById(int u_id);
    @Update("update  interview  set status=5 where r_id=#{u_id}")
    int updateNById(int u_id);
}

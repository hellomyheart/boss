package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.entity.Interview;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewMapper extends BaseMapper<Interview> {

    @Update("update interview set address = #{address},i_time = #{i_time},status = #{status} where u_id = #{u_id}")
    int updateById(Interview entity);
}

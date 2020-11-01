package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.entity.Position;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

public interface PositionMapper extends BaseMapper<Position> {
    @Update("update position set c_id = #{cid} ,name =#{name} ,decription =#{decription} ,skill=#{skill},salary=#{salary}  where id=#{id} ")
    int update(Position position);

    @Update("update position set status = 0  where id=#{id} ")
    int delete(Integer id);

}
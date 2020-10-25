package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.dto.PositionDto;
import com.example.boss.entity.Position;
import com.example.boss.vo.ResponseResult;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

/**
 * @ProjectName: boss
 * @Author: Zsh
 * @Time: 2020/10/22 20:25
 * @Description:
 */
public interface PositionMapper extends BaseMapper<Position> {
    /**
     * 添加职位
     * @param position
     * @return
     */
    @Insert("insert into position (c_id,name,decription,skill,salary,createtime) values (#{cid},#{name},#{decription},#{skill},#{salary},#{createTime})")
    int add(Position  position);

    /**
     * 修改职位信息
     * @param position
     * @return
     */
    @Update("update position set c_id = #{cid} ,name =#{name} ,decription =#{decription} ,skill=#{skill},salary=#{salary} ,updatetime=#{updateTime} where id=#{id} ")
    int update(Position position);
    @Delete("delete from position where id =#{id}")
    int delete(Integer id);
}

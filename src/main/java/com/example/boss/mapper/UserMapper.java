package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {

    @Select("select  * from user where nickname=#{n} or phone=#{p}")
    @ResultType(User.class)
    User selectByNamePhone(@Param("n") String  n , @Param("p") String p);
}
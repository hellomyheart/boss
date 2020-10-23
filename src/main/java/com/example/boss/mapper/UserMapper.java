package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.dto.UserDto;
import com.example.boss.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

/**
 * @description
 * @className: UserMapper
 * @package: com.example.dingding.mapper
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:42
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select  * from user where nickname=#{n} or phone=#{p}")
    @ResultType(User.class)
    User selectByNamePhone(@Param("n") String  n , @Param("p") String p);

    @Select("select * from user where nickname=#{n} or phone =#{n}")
    @ResultType(User.class)
    User selectByName(String n);
}

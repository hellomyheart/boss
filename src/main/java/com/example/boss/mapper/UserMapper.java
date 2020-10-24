package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.dto.UserDto;
import com.example.boss.entity.User;
import com.example.boss.vo.ResponseResult;
import org.apache.ibatis.annotations.*;

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

    @Select("select * from user where email = #{email}")
    @ResultType(User.class)
    User selectByEmail(String email);

    @Update("update user set password = #{password} where email = #{email} ")
    int findPwd(String email,String password);

    @Update("update user set password = #{password} where id = #{uid} ")
    int updatePwd(int uid, String password);
}

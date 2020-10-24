package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.entity.Company;
import org.apache.ibatis.annotations.Insert;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/24 19:20
 * @Description:
 */
public interface CompanyMapper extends BaseMapper<Company> {

    @Insert("insert into company (u_id,address,name,decription,status,createtime) values (#{uid},#{address},#{name},#{decription},1,#{createtime})")
    int add(Company company);
}

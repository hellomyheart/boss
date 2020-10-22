package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.dto.RecruitDto2;
import com.example.boss.entity.Recruit;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitMapper extends BaseMapper<Recruit> {

    @Insert("insert into recruit(p_id,num,address,createtime,updatetime) values(#{p_id},#{num},#{address},#{createtime},#{updatetime})")
    int insertDto(RecruitDto2 recruit);

}

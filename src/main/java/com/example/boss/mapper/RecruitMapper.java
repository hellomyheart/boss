package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.entity.Recruit;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecruitMapper extends BaseMapper<Recruit> {

    @Select("SELECT rt.p_id,rt.num,rt.address,rt.createtime,rt.updatetime FROM recruit rt JOIN POSITION pn ON  rt.p_id = pn.id JOIN company cy ON pn.c_id = cy.id WHERE cy.id = #{id}")
    List<Recruit> selectAllRecruitByCompany(Integer id);

//    @Insert("insert into recruit(p_id,num,address,createtime,updatetime) values(#{p_id},#{num},#{address},#{createtime},#{updatetime})")
//    int insertDto(RecruitDto2 recruit);

}

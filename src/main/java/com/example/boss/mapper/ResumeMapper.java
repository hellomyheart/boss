package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.dto.ResumeDto;
import com.example.boss.dto.Resumeupdatedto;
import com.example.boss.entity.Resume;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 21:26
 * @Description:
 */
public interface ResumeMapper extends BaseMapper<Resume> {
    @Insert("insert  into resume (u_id,address,createtime)values (#{u_id},#{address},#{createtime})")
    int insertDto(ResumeDto resumeDto);

    @Update("update resume set address=#{address},updatetime=now() where u_id = #{u_id}")
    int updateAddById(int u_id, String address);


}

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

    @Update("update resume set address=#{address},updatetime=now() where u_id = #{u_id} and status=1")
    int updateAddById(int u_id, String address);


    @Update("update resume set status=2 where u_id = #{u_id}")
    int updateById(int u_id);

    @Update("update resume set ossbucketname=#{ossbucketname},filename=#{filename},filecreatetime=now() where u_id=#{u_id}")
    void updatenameById(int u_id, String ossbucketname, String filename);
}

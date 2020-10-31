package com.example.boss.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.boss.entity.Resume;
import org.apache.ibatis.annotations.Insert;

public interface ResumeMapper extends BaseMapper<Resume> {
    @Insert("insert into resume set address=#{url} ,createtime=now()")
    int inserta(String url);
}
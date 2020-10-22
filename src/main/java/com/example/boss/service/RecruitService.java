package com.example.boss.service;

import com.example.boss.mapper.RecruitMapper;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 20:08
 * @Description:
 */
public interface RecruitService {
    //查询所有招聘信息
    ResponseResult selectAll();

}

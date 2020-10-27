package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.entity.Recruit;
import com.example.boss.mapper.RecruitMapper;
import com.example.boss.service.RecruitService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 20:08
 * @Description:
 */
@Service
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitMapper dao;

    /**
     * 查询所有招聘信息
     * @return
     */
    @Override
    public ResponseResult selectAll() {
        QueryWrapper<Recruit> qw = new QueryWrapper<>();
        qw.orderByDesc("createtime");
        return ResponseResult.ok(dao.selectList(qw));
    }
}

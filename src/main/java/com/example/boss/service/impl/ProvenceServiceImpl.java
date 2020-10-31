package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.entity.City;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.entity.Provence;
import com.example.boss.mapper.ProvenceMapper;
import com.example.boss.service.ProvenceService;
@Service
public class ProvenceServiceImpl extends ServiceImpl<ProvenceMapper, Provence> implements ProvenceService{
    @Autowired
    private ProvenceMapper dao;


    /**
     * 查询所有省
     * @return
     */
    @Override
    public ResponseResult findAll() {
        QueryWrapper<Provence> qw = new QueryWrapper<>();
        qw.orderByDesc("id");
        List<Provence> list = dao.selectList(qw);
        if (list!=null) {
            return ResponseResult.ok(list);
        }
        return ResponseResult.fail();
    }


}

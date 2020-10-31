package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.CityMapper;
import com.example.boss.entity.City;
import com.example.boss.service.CityService;
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService{
    @Autowired
    private CityMapper dao;

    /**
     * 查询所有市
     * @param id
     * @return
     */
    public ResponseResult findAllCity(int id) {
        QueryWrapper<City> qw = new QueryWrapper<>();
        qw.eq("p_id",id);
        qw.orderByDesc("id");
        List<City> list = dao.selectList(qw);
        if (list !=null) {
            return ResponseResult.ok(list);
        }
        return ResponseResult.fail();
    }

}

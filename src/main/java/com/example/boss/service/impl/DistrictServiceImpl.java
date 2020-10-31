package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.DistrictMapper;
import com.example.boss.entity.District;
import com.example.boss.service.DistrictService;
@Service
public class DistrictServiceImpl extends ServiceImpl<DistrictMapper, District> implements DistrictService{
    @Autowired
    private DistrictMapper dao;

    /**
     * 查询区
     * @param id
     * @return
     */
    @Override
    public ResponseResult findAllDistrict(int id) {
        QueryWrapper<District> qw = new QueryWrapper<>();
        qw.eq("c_id" ,id);
        qw.orderByDesc("id");
        List<District> list = dao.selectList(qw);
        if (list!=null) {
            return ResponseResult.ok(list);
        }
            return ResponseResult.fail();
    }
}

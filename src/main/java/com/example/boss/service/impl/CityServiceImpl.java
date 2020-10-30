package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.CityMapper;
import com.example.boss.entity.City;
import com.example.boss.service.CityService;
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService{

}

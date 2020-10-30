package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.DistrictMapper;
import com.example.boss.entity.District;
import com.example.boss.service.DistrictService;
@Service
public class DistrictServiceImpl extends ServiceImpl<DistrictMapper, District> implements DistrictService{

}

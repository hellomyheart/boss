package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.AddressInfoMapper;
import com.example.boss.entity.AddressInfo;
import com.example.boss.service.AddressInfoService;
@Service
public class AddressInfoServiceImpl extends ServiceImpl<AddressInfoMapper, AddressInfo> implements AddressInfoService{

}

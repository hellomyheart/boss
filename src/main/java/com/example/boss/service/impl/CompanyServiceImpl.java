package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.entity.Company;
import com.example.boss.mapper.CompanyMapper;
import com.example.boss.service.CompanyService;
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService{

}

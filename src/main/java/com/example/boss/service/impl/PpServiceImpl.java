package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.PpMapper;
import com.example.boss.entity.Pp;
import com.example.boss.service.PpService;
@Service
public class PpServiceImpl extends ServiceImpl<PpMapper, Pp> implements PpService{

}

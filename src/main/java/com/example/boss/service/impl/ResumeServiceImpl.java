package com.example.boss.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.ResumeMapper;
import com.example.boss.entity.Resume;
import com.example.boss.service.ResumeService;
@Service
public class ResumeServiceImpl extends ServiceImpl<ResumeMapper, Resume> implements ResumeService{

}

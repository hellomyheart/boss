package com.example.boss.service.impl;

import com.example.boss.entity.Resume;
import com.example.boss.entity.User;
import com.example.boss.mapper.ResumeMapper;
import com.example.boss.mapper.UserMapper;
import com.example.boss.service.ResumeService;
import com.example.boss.util.TokenUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 21:26
 * @Description:
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeMapper dao;

    @Autowired
    private UserMapper userdao;

    /**
     * 上传简历
     * @param token
     * @param resume
     * @return
     */
    @Override
    public ResponseResult add(String token, Resume resume) {
        //获取当前登录用户id
        int uid = TokenUtil.getUid(token);
        //实例化简历对象
        Resume resume1 = new Resume(uid, resume.getAddress(), new Date());
        //插入简历
        if (dao.insert(resume1)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}

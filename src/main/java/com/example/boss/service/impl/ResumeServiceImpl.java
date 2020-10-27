package com.example.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.boss.dto.ResumeDto;
import com.example.boss.dto.Resumeupdatedto;
import com.example.boss.entity.Resume;
import com.example.boss.entity.User;
import com.example.boss.mapper.ResumeMapper;
import com.example.boss.mapper.UserMapper;
import com.example.boss.service.ResumeService;
import com.example.boss.third.AliOssUtil;
import com.example.boss.util.TokenUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

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


    /**
     * 上传简历
     * @param token
     * @param
     * @return
     */
    @Override
    public ResponseResult add(String token, String address) {
        //获取当前登录用户id
        int uid = TokenUtil.getUid(token);
        //实例化简历对象
        ResumeDto resumeDto = new ResumeDto(uid, address, new Date());
        //插入简历
        if (dao.insertDto(resumeDto)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    /**
     * 查询简历
     * @param token
     * @return
     */
    @Override
    public ResponseResult select(String token) {
        //获取id
        int uid = TokenUtil.getUid(token);

        QueryWrapper<Resume> qw = new QueryWrapper<>();
        qw.eq("u_id",uid);
        qw.orderByDesc("createtime");
        return ResponseResult.ok(dao.selectList(qw));
    }

    /**
     * 修改简历
     * @param token
     * @param
     * @return
     */
    @Override
    public ResponseResult update(String token, String address) {
        //获取id
        int uid = TokenUtil.getUid(token);
        //更改面试地址
        if (dao.updateAddById(uid,address)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    /**
     * 删除简历
     * @param token
     * @return
     */
    @Override
    public ResponseResult delete(String token) {
        int uid = TokenUtil.getUid(token);
        if (dao.updateById(uid)>0) {
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    /**
     * 上传简历附件
     * @param token
     * @param file
     * @return
     */
    @Override
    public ResponseResult insert(String token, MultipartFile file) throws IOException {
        //获取id
        int uid = TokenUtil.getUid(token);
        //判断是否为空
        if (!file.isEmpty()) {
            //获取文件名
            String filename = file.getOriginalFilename();
            //上传文件
            String s = AliOssUtil.uploadByte(AliOssUtil.BucketName, filename, file.getBytes());
            //把文件名插入数据库
            dao.updatenameById(uid,AliOssUtil.BucketName,filename);
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
    //文件名处理
    private String rename(String f){
        //长度
        if (f.length()>50) {
            //从前往后第f.length() - 50位开始截取
            f = f.substring(f.length() - 50);
        }
        //重命名
        //UUID.randomUUID()获取随机32位字符串
        //replaceAll去除
        return UUID.randomUUID().toString().replaceAll("-","")+"_"+f;
    }
}

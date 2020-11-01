package com.example.boss.service.impl;

import com.example.boss.third.AliOssUtil;
import com.example.boss.util.StrUtil;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boss.mapper.ResumeMapper;
import com.example.boss.entity.Resume;
import com.example.boss.service.ResumeService;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ResumeServiceImpl extends ServiceImpl<ResumeMapper, Resume> implements ResumeService{
    @Autowired
    private ResumeMapper dao;


    @Override
    public ResponseResult sendResume(MultipartFile file) throws IOException {
        //是否为空
        if (!file.isEmpty()) {
            //获取文件名
            String filename = file.getOriginalFilename();
            //上传文件
            String s = AliOssUtil.uploadByte(AliOssUtil.BucketName, filename, file.getBytes());
            //访问路径
            String url = AliOssUtil.getUrl(AliOssUtil.BucketName, filename);
            System.out.println("url = " + url);
            //将地址插入数据库
            dao.inserta(url);
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

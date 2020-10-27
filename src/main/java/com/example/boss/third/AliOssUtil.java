package com.example.boss.third;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import com.aliyun.oss.model.Bucket;
import com.example.boss.config.SystemConfig;
import com.example.boss.util.DateUtil;


import java.io.ByteArrayInputStream;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/27 17:23
 * @Description:阿里云oss 资源云存储
 */
public class AliOssUtil {
    // Endpoint以杭州为例，其它Region请按实际情况填写。
    private static final String endpoint = "https://oss-cn-beijing.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
    private static final String accessKeyId = "LTAI4G5MnoafAJKroTVPTbG6";
    private static final String accessKeySecret = "WwwyE2T194macH42QYA1M3HEfSg1tI";
    public static final String BucketName = "bossdemo";
    private static OSS ossClient;
    static {
        // 创建OSSClient实例
        ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
    }
    //创建存储空间
    public static boolean createBucket(String name){
        Bucket b=ossClient.createBucket(name);
        return b!=null;
    }
    //上传内容
    public static String uploadByte(String bucket,String objname,byte[] data){
        ossClient.putObject(bucket,objname,new ByteArrayInputStream(data));
        return getUrl(bucket, objname);
    }
    //删除文件
    public static boolean delObj(String bucketName,String objname){
        ossClient.deleteObject(bucketName, objname);
        return true;
    }
    //删除存储空间
    public static boolean delBlu(String bucketName){
        ossClient.deleteBucket(bucketName);
        return true;
    }


    //创建访问地址
    public static String getUrl(String bucket,String objname){
        return ossClient.generatePresignedUrl(bucket,objname, DateUtil.addTime(SystemConfig.OSS_TIME,1)).toString();
    }
}



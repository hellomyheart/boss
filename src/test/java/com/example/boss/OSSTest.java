package com.example.boss;

import com.example.boss.third.AliOssUtil;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/27 17:43
 * @Description:
 */
public class OSSTest {
    @Test
    public void t1() throws IOException {
        //本地文件路径
        FileInputStream fis=new FileInputStream("D:\\桌面壁纸2\\4.jpg");

        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        byte[] data=new byte[1024];
        int len;
        while ((len=fis.read(data))!=-1){
            baos.write(data,0,len);
        }
        //云服务器的位置
        //文件名字
        String url= AliOssUtil.uploadByte("bossdemo","4.jpg",baos.toByteArray());
        System.out.println(url);

    }
}

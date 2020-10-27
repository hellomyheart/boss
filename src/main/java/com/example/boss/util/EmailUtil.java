package com.example.boss.util;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/23 19:18
 * @Description: 基于JAVA的邮箱，实现邮箱发送
 */
public class EmailUtil {
    public static boolean sendEmail(String email,int code)  {
        //1.设置常规信息  Map集合的子类  可以持久化
        Properties properties=new Properties();
        //开启邮箱认证
        properties.put("mail.smtp.auth",true);
        //设置邮箱服务器
        properties.put("mail.host","smtp.163.com");
        //创建授权对象
        Authenticator authenticator=new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("zzjava168@163.com","RQWVRNHSMRYFFZHR");
            }
        };
        //创建会话对象
        Session session= Session.getDefaultInstance(properties,authenticator);
        //创建消息对象
        Message message=new MimeMessage(session);
        try {
            //设置发件人
            message.setFrom(new InternetAddress("zzjava168@163.com"));
            //设置接收人
            /**
             * 接收人有三种：
             * 1.收件人 RecipientType.TO
             * 2.抄送人 RecipientType.CC
             * 3.密送人 RecipientType.BCC
             * */
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            //设置邮箱标题
            message.setSubject("boss直聘");
            //设置邮箱的正文内容
            //message.setText();
            message.setContent("您正在进行的操作的验证码为" + code, "text/html;charset=UTF-8");
            //发送邮件
            Transport.send(message);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}

package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @description
 * @className: User
 * @package: com.example.dingding.entity
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:33
 */
@Data
@TableName("user")
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1597284071733675232L;

    @TableId(type = IdType.AUTO)
    private int id;
    private String phone;
    private String email;
    private String password;
    private String nickname;
    private String icon;
    private int status;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date createtime;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date updatetime;

    public User(String phone, String email, String password, String nickname, int status, Date createtime) {
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.status = status;
        this.createtime = createtime;
    }

    public User(int id, String phone, String email, String nickname, String icon, int status, Date updatetime) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.nickname = nickname;
        this.icon = icon;
        this.status = status;
        this.updatetime = updatetime;
    }
}

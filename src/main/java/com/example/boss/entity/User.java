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
@TableName("t_user")
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
}

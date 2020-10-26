package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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

    // private static final long serialVersionUID = 1597284071733675232L;
    @TableId(type = IdType.AUTO)
    private int id;
    private String phone;//手机号
    private String email;//邮箱
    private String password;//密码
    private String nickname;//昵称
    private String icon;//头像
    private int status;//标志位 0 未激活，1激活
    private Date createtime;//创建时间
    private Date updatetime;//修改时间

}
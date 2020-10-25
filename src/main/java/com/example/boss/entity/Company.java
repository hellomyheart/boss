package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/24 18:14
 * @Description: 公司信息表
 */
@Data
@TableName("company")
@NoArgsConstructor
public class Company {
    @TableId(type = IdType.AUTO)
    private int id;
    @TableField("u_id")
    private int uid;
    private String name;
    private String address;
    private String decription;
    private int status;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date createtime;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date updatetime;

    public Company(int uid, String name, String address, String decription, int status, Date createtime) {
        this.uid = uid;
        this.name = name;
        this.address = address;
        this.decription = decription;
        this.status = status;
        this.createtime = createtime;
    }

    public Company(int id, int uid, String name, String address, String decription, int status, Date updatetime) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.address = address;
        this.decription = decription;
        this.status = status;
        this.updatetime = updatetime;
    }
}

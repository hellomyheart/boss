package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 20:56
 * @Description:
 */
@Data
@TableName("/company")
@NoArgsConstructor
public class Company {
    @TableId(type = IdType.AUTO)
    private int id;
    private int u_id;
    private String cname;
    private String address;
    private String cdecription;
    private int status;
    private Date createtime;
    private Date updatetime;


    public Company(String cname, String address, String cdecription, int status) {
        this.cname = cname;
        this.address = address;
        this.cdecription = cdecription;
        this.status = status;
    }

    public Company(int uid, String name, String address, String decription, int i, Date date) {
    }

    public Company(Integer id, int uid, String address, String decription, String name, int i, Date date) {
    }

    public Company(Integer id, int i) {
    }
}
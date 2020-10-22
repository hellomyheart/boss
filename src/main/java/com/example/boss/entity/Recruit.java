package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 20:01
 * @Description:招聘表
 */
@Data
@TableName("recruit")
@NoArgsConstructor
public class Recruit {
    @TableId(type = IdType.AUTO)
    private int id;
    private int p_id;//职位id
    private int num;//招聘人数
    private String address;//工作地址
    private Date createtime;
    private Date updatetime;

    public Recruit(int p_id, int num, String address) {
        this.p_id = p_id;
        this.num = num;
        this.address = address;
    }
}

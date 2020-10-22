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
 * @Time: 2020/10/22 21:23
 * @Description:简历表
 */
@Data
@TableName("resume")
@NoArgsConstructor
public class Resume {
    @TableId(type = IdType.AUTO)
    private int id;
    private int u_id;
    private String address;//简历地址
    private Date createtime;
    private Date updatetime;

    public Resume(int u_id, String address, Date createtime) {
        this.u_id = u_id;
        this.address = address;
        this.createtime = createtime;
    }
}

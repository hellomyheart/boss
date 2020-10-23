package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("recruit")
public class Recruit {
    @TableId("id")
    private Integer id;
    @TableField("p_id")
    private Integer p_id;
    @TableField("num")
    private Integer num;
    @TableField("address")
    private String address;
    @TableField("createtime")
    private Date createtime;
    @TableField("updatetime")
    private Date updatetime;

    public Recruit(Integer p_id, Integer num, String address, Date createtime, Date updatetime) {
        this.p_id = p_id;
        this.num = num;
        this.address = address;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }
    public Recruit(Integer id,Integer p_id, Integer num, String address, Date updatetime) {
        this.id = id;
        this.p_id = p_id;
        this.num = num;
        this.address = address;
        this.updatetime = updatetime;
    }
}

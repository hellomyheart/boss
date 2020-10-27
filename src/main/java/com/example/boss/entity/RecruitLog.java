package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("recruit_log")
public class RecruitLog {
    @TableId("id")
    private int id;
    @TableField("h_id")
    private int hid;
    @TableField("o_type")
    private String oType;
    @TableField("status")
    private int status;
    @TableField("createtime")
    private Date createtime;

    public RecruitLog(int hid, String oType, int status, Date createtime) {
        this.hid = hid;
        this.oType = oType;
        this.status = status;
        this.createtime = createtime;
    }
}

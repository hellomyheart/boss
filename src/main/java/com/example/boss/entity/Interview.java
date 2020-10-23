package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
@TableName("interview")
public class Interview {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("r_id")
    private Integer r_id;
    @TableField("u_id")
    private Integer u_id;
    @TableField("address")
    private String address;
    @TableField("i_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date i_time;
    @TableField("status")
    private Integer status;

    public Interview(int r_id, int u_id, String address, Date t_time, Integer status) {
        this.r_id = r_id;
        this.u_id = u_id;
        this.address = address;
        this.i_time = t_time;
        this.status = status;
    }
}

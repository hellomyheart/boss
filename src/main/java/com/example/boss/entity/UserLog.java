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
 * @Time: 2020/10/27 13:49
 * @Description: 用户日志表
 */
@Data
@NoArgsConstructor
@TableName("user_log")
public class UserLog {
    @TableId(type = IdType.AUTO)
    private int id;
    @TableField("u_id")
    private int uid;
    private String type;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date createtime;
    private int status;

    public UserLog(int uid, String type, Date createtime, int status) {
        this.uid = uid;
        this.type = type;
        this.createtime = createtime;
        this.status = status;
    }
}


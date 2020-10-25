package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: 张尚斌
 * @Time: 2020/10/25 19:45
 * @Description:
 */
@Data
@TableName("position")
@NoArgsConstructor
public class PositionLog {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer pid;
    private String info;
    private Integer o_type;
    private Date ctime;


    public PositionLog(Integer pid, String info, Integer o_type, Date ctime) {
        this.pid = pid;
        this.info = info;
        this.o_type = o_type;
        this.ctime = ctime;
    }
}
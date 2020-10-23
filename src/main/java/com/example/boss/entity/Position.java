package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: 张尚斌
 * @Time: 2020/10/22 20:18
 * @Description:
 */
@Data
@TableName("position")
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("c_id")
    private Integer cid;
    private String name;
    private String decription;
    private String skill;
    private String salary;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" , timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    private Date updateTime;

    public Position(Integer cid, String name, String decription, String skill, String salary, Date createTime) {
        this.cid = cid;
        this.name = name;
        this.decription = decription;
        this.skill = skill;
        this.salary = salary;
        this.createTime = createTime;
    }
}
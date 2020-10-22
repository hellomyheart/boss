package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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

    private Integer cid;
    private String name;
    private String decription;
    private String skill;
    private String salary;
    private Date createTime;
    private Date updateTime;

    public Position(Integer cid, String name, String decription, String skill, String salary, Date createTime, Date updateTime) {
        this.cid = cid;
        this.name = name;
        this.decription = decription;
        this.skill = skill;
        this.salary = salary;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
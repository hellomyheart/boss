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
 * @Time: 2020/10/22 19:49
 * @Description:职位表
 */
@Data
@TableName("position")
@NoArgsConstructor
public class Position {
    @TableId(type = IdType.AUTO)
    private int id;
    private int c_id;//公司id
    private String name;//职位名字
    private String decription;//描述
    private String skill;//技术
    private String salary;//薪水
    private Date createtime;//创建时间
    private Date updatetime;//更改时间

    public Position(int c_id, String name, String decription, String skill, String salary) {
        this.c_id = c_id;
        this.name = name;
        this.decription = decription;
        this.skill = skill;
        this.salary = salary;
    }
}

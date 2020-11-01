package com.example.boss.dto;

import lombok.Data;

/**
 * @ProjectName: boss
 * @Author: 张尚斌
 * @Time: 2020/10/31 16:36
 * @Description:
 */
@Data
public class PositionDto {

    private Integer cid;
    private String name;
    private String description;
    private String skill;
    private String salary;

}
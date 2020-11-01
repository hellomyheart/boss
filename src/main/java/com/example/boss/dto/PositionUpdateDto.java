package com.example.boss.dto;

import lombok.Data;
import org.apache.ibatis.annotations.Delete;

/**
 * @ProjectName: boss
 * @Author: 张尚斌
 * @Time: 2020/10/31 17:13
 * @Description:
 */
@Data
public class PositionUpdateDto {
    private Integer cid;
    private String name;
    private String description;
    private String skill;
    private String salary;
}
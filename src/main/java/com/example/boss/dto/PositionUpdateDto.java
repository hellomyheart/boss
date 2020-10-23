package com.example.boss.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

/**
 * @ProjectName: boss
 * @Author: 张尚斌
 * @Time: 2020/10/23 19:18
 * @Description:
 */
@Data
public class PositionUpdateDto {
    private Integer id;
    private Integer cid;
    private String name;
    private String decription;
    private String skill;
    private String salary;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
}
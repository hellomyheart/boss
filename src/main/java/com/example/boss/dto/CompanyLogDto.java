package com.example.boss.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/27 15:20
 * @Description:
 */
@Data
public class CompanyLogDto {
    private int uid;
    private String type;
    private int status;
}

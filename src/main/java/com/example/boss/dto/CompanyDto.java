package com.example.boss.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/24 19:20
 * @Description:
 */
@Data
@NoArgsConstructor
public class CompanyDto {
    private int uid;
    private String name;
    private String address;
    private String decription;
}

package com.example.boss.dto;

import lombok.Data;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/22 23:08
 * @Description:
 */
@Data
public class SmsRCodeDto {
    private String phone;
    private int code;
}
package com.example.boss.dto;

import lombok.Data;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/23 19:00
 * @Description:
 */
@Data
public class UserLoginDto {
    private String name; // 可能是昵称 也可能是手机号
    private String password;
}

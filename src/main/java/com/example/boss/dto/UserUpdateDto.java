package com.example.boss.dto;

import lombok.Data;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/11/1 13:47
 * @Description:
 */
@Data
public class UserUpdateDto {
    private String email;
    private String nickname;
    private String icon;
}

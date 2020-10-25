package com.example.boss.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: Jsx
 * @Time: 2020/10/25 16:52
 * @Description:
 */
@Data
public class UserUpdateDto {

    private String phone;
    private String email;
    private String nickname;
    private String icon;
}

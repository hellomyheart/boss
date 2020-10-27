package com.example.boss.dto;

import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/27 14:37
 * @Description:
 */
@Data
public class Resumeupdatedto {
    private String address;//简历地址
    private Date updatetime;

    public Resumeupdatedto(String address, Date updatetime) {
        this.address = address;
        this.updatetime = updatetime;
    }
}

package com.example.boss.dto;

import lombok.Data;

import java.util.Date;

@Data
public class RecruitDto2 {
    private Integer p_id;
    private Integer num;
    private String address;
    private Date createtime;
    private Date updatetime;

    public RecruitDto2(Integer p_id, Integer num, String address, Date createtime, Date updatetime) {
        this.p_id = p_id;
        this.num = num;
        this.address = address;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }
}

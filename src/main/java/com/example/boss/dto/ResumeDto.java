package com.example.boss.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/26 22:11
 * @Description:
 */
@Data
@NoArgsConstructor
public class ResumeDto {
    private int u_id;
    private String address;//简历地址
    private Date createtime;

    public ResumeDto(int u_id, String address, Date createtime) {
        this.u_id = u_id;
        this.address = address;
        this.createtime = createtime;
    }
}

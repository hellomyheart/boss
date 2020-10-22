package com.example.boss.dto;

import lombok.Data;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 20:54
 * @Description:
 */
@Data
public class RecruitAllDto {
    private int num;//招聘人数
    private String address;//工作地址
    private String name;//职位名字
    private String decription;//描述
    private String skill;//技术
    private String salary;//薪水
    private String cname;//公司名字
    private String cdecription;//公司描述

}

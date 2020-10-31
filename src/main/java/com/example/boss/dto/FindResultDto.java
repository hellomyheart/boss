package com.example.boss.dto;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/31 16:16
 * @Description:
 */
public class FindResultDto {
    private String p_name;
    private String p_decription;
    private String p_skill;
    private String c_name;
    private int r_num;
    private String r_address;
    private Date r_createtime;
    private int r_salary;

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_decription() {
        return p_decription;
    }

    public void setP_decription(String p_decription) {
        this.p_decription = p_decription;
    }

    public String getP_skill() {
        return p_skill;
    }

    public void setP_skill(String p_skill) {
        this.p_skill = p_skill;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getR_num() {
        return r_num;
    }

    public void setR_num(int r_num) {
        this.r_num = r_num;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }

    public Date getR_createtime() {
        return r_createtime;
    }

    public void setR_createtime(Date r_createtime) {
        this.r_createtime = r_createtime;
    }

    public int getR_salary() {
        return r_salary;
    }

    public void setR_salary(int r_salary) {
        this.r_salary = r_salary;
    }
}

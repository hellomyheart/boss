package com.example.boss.dto;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/31 16:06
 * @Description:根据条件查询招聘信息
 */
public class FindByType {
    private String r_address;//工作地点
    //private int r_salaryH;//最高工资
    //private int r_salaryL;//最低工资
    private String c_name;//公司名字
    private String p_name;//岗位名字


    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }

    //public int getR_salaryH() {
    //    return r_salaryH;
    //}
    //
    //public void setR_salaryH(int r_salaryH) {
    //    this.r_salaryH = r_salaryH;
    //}
    //
    //public int getR_salaryL() {
    //    return r_salaryL;
    //}
    //
    //public void setR_salaryL(int r_salaryL) {
    //    this.r_salaryL = r_salaryL;
    //}

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    @Override
    public String toString() {
        return "FindByType{" +
                "r_address='" + r_address + '\'' +
                //", r_salaryH=" + r_salaryH +
                //", r_salaryL=" + r_salaryL +
                ", c_name='" + c_name + '\'' +
                ", p_name='" + p_name + '\'' +
                '}';
    }

    public FindByType(String r_address,  String c_name, String p_name) {
        this.r_address = r_address;
        //this.r_salaryH = r_salaryH;
        //this.r_salaryL = r_salaryL;
        this.c_name = c_name;
        this.p_name = p_name;
    }
}

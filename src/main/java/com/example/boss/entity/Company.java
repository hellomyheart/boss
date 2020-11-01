package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 公司表
    */
@ApiModel(value="com-example-boss-entity-Company")
@Data
@TableName(value = "company")
@NoArgsConstructor
@AllArgsConstructor
public class Company implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 用户id
     */
    @TableField(value = "u_id")
    @ApiModelProperty(value="用户id")
    private Integer uId;

    /**
     * 公司名
     */
    @TableField(value = "name")
    @ApiModelProperty(value="公司名")
    private String name;

    /**
     * 公司地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value="公司地址")
    private String address;

    /**
     * 公司简介
     */
    @TableField(value = "decription")
    @ApiModelProperty(value="公司简介")
    private String decription;

    /**
     * 状态（1.正常，0.删除）
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态（1.正常，0.删除）")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "createtime")
    @ApiModelProperty(value="创建时间")
    private Date createtime;

    /**
     * 修改时间
     */
    @TableField(value = "updatetime")
    @ApiModelProperty(value="修改时间")
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_U_ID = "u_id";

    public static final String COL_NAME = "name";

    public static final String COL_ADDRESS = "address";

    public static final String COL_DECRIPTION = "decription";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public Company(Integer uId, String name, String address, String decription, Integer status, Date createtime, Date updatetime) {
        this.uId = uId;
        this.name = name;
        this.address = address;
        this.decription = decription;
        this.status = status;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Company(Integer id, Integer uId, String name, String address, String decription, Date updatetime) {
        this.id = id;
        this.uId = uId;
        this.name = name;
        this.address = address;
        this.decription = decription;
        this.updatetime = updatetime;
    }

    public Company(Integer id, Integer status) {
        this.id = id;
        this.status = status;
    }
}
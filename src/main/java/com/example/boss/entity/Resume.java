package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
    * 简历表
    */
@ApiModel(value="com-example-boss-entity-Resume")
@Data
@TableName(value = "resume")
public class Resume implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 应聘者id
     */
    @TableField(value = "a_id")
    @ApiModelProperty(value="应聘者id")
    private Integer aId;

    /**
     * 简历地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value="简历地址")
    private String address;

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

    public static final String COL_A_ID = "a_id";

    public static final String COL_ADDRESS = "address";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";
}
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
    * 简历权限表
    */
@ApiModel(value="com-example-boss-entity-Authority")
@Data
@TableName(value = "authority")
public class Authority implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 应聘者id
     */
    @TableField(value = "a_id")
    @ApiModelProperty(value="应聘者id")
    private Integer aId;

    /**
     * 简历ID
     */
    @TableField(value = "r_id")
    @ApiModelProperty(value="简历ID")
    private Integer rId;

    /**
     * 招聘者
     */
    @TableField(value = "ri_id")
    @ApiModelProperty(value="招聘者")
    private Integer riId;

    /**
     * status(状态0，请求(redis)1，确认2.拒绝)
     */
    @TableField(value = "status")
    @ApiModelProperty(value="status(状态0，请求(redis)1，确认2.拒绝)")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "createtime")
    @ApiModelProperty(value="创建时间")
    private Date createtime;

    /**
     * 更新时间
     */
    @TableField(value = "updatetime")
    @ApiModelProperty(value="更新时间")
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_A_ID = "a_id";

    public static final String COL_R_ID = "r_id";

    public static final String COL_RI_ID = "ri_id";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";
}
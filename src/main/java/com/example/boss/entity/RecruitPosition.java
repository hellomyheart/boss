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
    * 招聘者职位表
    */
@ApiModel(value="com-example-boss-entity-RecruitPosition")
@Data
@TableName(value = "recruit_position")
public class RecruitPosition implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 招聘者id
     */
    @TableField(value = "ri_id")
    @ApiModelProperty(value="招聘者id")
    private Integer riId;

    /**
     * 招聘者职位职位名
     */
    @TableField(value = "rp_name")
    @ApiModelProperty(value="招聘者职位职位名")
    private String rpName;

    @TableField(value = "createtime")
    @ApiModelProperty(value="")
    private Date createtime;

    @TableField(value = "updatetime")
    @ApiModelProperty(value="")
    private Date updatetime;

    /**
     * status(状态0，删除1，正常）
     */
    @TableField(value = "status")
    @ApiModelProperty(value="status(状态0，删除1，正常）")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_RI_ID = "ri_id";

    public static final String COL_RP_NAME = "rp_name";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public static final String COL_STATUS = "status";
}
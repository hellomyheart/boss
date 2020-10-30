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
    * 职位表
    */
@ApiModel(value="com-example-boss-entity-Position")
@Data
@TableName(value = "`position`")
public class Position implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 公司id
     */
    @TableField(value = "c_id")
    @ApiModelProperty(value="公司id")
    private Integer cId;

    /**
     * 发布者id(招聘者id)
     */
    @TableField(value = "ri_id")
    @ApiModelProperty(value="发布者id(招聘者id)")
    private Integer riId;

    /**
     * 职位名
     */
    @TableField(value = "name")
    @ApiModelProperty(value="职位名")
    private String name;

    /**
     * 职位描述
     */
    @TableField(value = "decription")
    @ApiModelProperty(value="职位描述")
    private String decription;

    /**
     * 技能&要求
     */
    @TableField(value = "skill")
    @ApiModelProperty(value="技能&要求")
    private String skill;

    /**
     * 预期工资
     */
    @TableField(value = "salary")
    @ApiModelProperty(value="预期工资")
    private String salary;

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

    /**
     * 状态（0.删除 1.正常）
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态（0.删除 1.正常）")
    private String status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_C_ID = "c_id";

    public static final String COL_RI_ID = "ri_id";

    public static final String COL_NAME = "name";

    public static final String COL_DECRIPTION = "decription";

    public static final String COL_SKILL = "skill";

    public static final String COL_SALARY = "salary";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public static final String COL_STATUS = "status";
}
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
    * 招聘信息表
    */
@ApiModel(value="com-example-boss-entity-Recruit")
@Data
@TableName(value = "recruit")
public class Recruit implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 职位id
     */
    @TableField(value = "p_id")
    @ApiModelProperty(value="职位id")
    private Integer pId;

    /**
     * 招聘人数
     */
    @TableField(value = "num")
    @ApiModelProperty(value="招聘人数")
    private Integer num;

    /**
     * 工作地点
     */
    @TableField(value = "address")
    @ApiModelProperty(value="工作地点")
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

    /**
     * 招聘工资
     */
    @TableField(value = "salary")
    @ApiModelProperty(value="招聘工资")
    private String salary;

    /**
     * 状态0.删除，1.正常
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态0.删除，1.正常")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_P_ID = "p_id";

    public static final String COL_NUM = "num";

    public static final String COL_ADDRESS = "address";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public static final String COL_SALARY = "salary";

    public static final String COL_STATUS = "status";
}
package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 系统职位1
    */
@ApiModel(value="com-example-boss-entity-SystemPositionOne")
@Data
@TableName(value = "system_position_one")
public class SystemPositionOne implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 系统职位名
     */
    @TableField(value = "sp_name")
    @ApiModelProperty(value="系统职位名")
    private String spName;

    /**
     * 状态0.删除，1.正常
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态0.删除，1.正常")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SP_NAME = "sp_name";

    public static final String COL_STATUS = "status";
}
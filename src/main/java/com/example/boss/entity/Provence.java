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
    * 省表
    */
@ApiModel(value="com-example-boss-entity-Provence")
@Data
@TableName(value = "provence")
public class Provence implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 省名字
     */
    @TableField(value = "p_name")
    @ApiModelProperty(value="省名字")
    private String pName;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_P_NAME = "p_name";
}
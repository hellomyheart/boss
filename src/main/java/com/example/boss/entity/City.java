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
    * 市表
    */
@ApiModel(value="com-example-boss-entity-City")
@Data
@TableName(value = "city")
public class City implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 省id
     */
    @TableField(value = "p_id")
    @ApiModelProperty(value="省id")
    private Integer pId;

    /**
     * 市名字
     */
    @TableField(value = "c_name")
    @ApiModelProperty(value="市名字")
    private String cName;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_P_ID = "p_id";

    public static final String COL_C_NAME = "c_name";
}
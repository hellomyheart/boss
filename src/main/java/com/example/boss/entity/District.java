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
    * 区表
    */
@ApiModel(value="com-example-boss-entity-District")
@Data
@TableName(value = "district")
public class District implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 市id
     */
    @TableField(value = "c_id")
    @ApiModelProperty(value="市id")
    private Integer cId;

    /**
     * 区名字
     */
    @TableField(value = "d_name")
    @ApiModelProperty(value="区名字")
    private String dName;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_C_ID = "c_id";

    public static final String COL_D_NAME = "d_name";
}
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
    * 应聘者
    */
@ApiModel(value="com-example-boss-entity-Applyinfo")
@Data
@TableName(value = "applyinfo")
public class Applyinfo implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    @TableField(value = "u_id")
    @ApiModelProperty(value="")
    private Integer uId;

    /**
     * 期望职位（系统职位3id）
     */
    @TableField(value = "sp_id")
    @ApiModelProperty(value="期望职位（系统职位3id）")
    private Integer spId;

    /**
     * 状态（0.删除，1.正常）
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态（0.删除，1.正常）")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_U_ID = "u_id";

    public static final String COL_SP_ID = "sp_id";

    public static final String COL_STATUS = "status";
}
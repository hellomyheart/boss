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
    * 招聘信息日志表
    */
@ApiModel(value="com-example-boss-entity-RecruitLog")
@Data
@TableName(value = "recruit_log")
public class RecruitLog implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "u_id")
    @ApiModelProperty(value="")
    private Integer uId;

    @TableField(value = "createtime")
    @ApiModelProperty(value="")
    private Date createtime;

    /**
     * 类型 add、update、delete
     */
    @TableField(value = "type")
    @ApiModelProperty(value="类型 add、update、delete")
    private String type;

    /**
     * 详情描述
     */
    @TableField(value = "decription")
    @ApiModelProperty(value="详情描述")
    private String decription;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_U_ID = "u_id";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_TYPE = "type";

    public static final String COL_DECRIPTION = "decription";
}
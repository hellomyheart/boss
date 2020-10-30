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

@ApiModel(value="com-example-boss-entity-Pp")
@Data
@TableName(value = "pp")
public class Pp implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 系统职位3级id
     */
    @TableField(value = "sp_id")
    @ApiModelProperty(value="系统职位3级id")
    private Integer spId;

    /**
     * 职位id
     */
    @TableField(value = "p_id")
    @ApiModelProperty(value="职位id")
    private Integer pId;

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

    /**
     * 状态0.删除1.正常
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态0.删除1.正常")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SP_ID = "sp_id";

    public static final String COL_P_ID = "p_id";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public static final String COL_STATUS = "status";
}
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
    * 面试表
    */
@ApiModel(value="com-example-boss-entity-Interview")
@Data
@TableName(value = "interview")
public class Interview implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 招聘id
     */
    @TableField(value = "ri_id")
    @ApiModelProperty(value="招聘id")
    private Integer riId;

    /**
     * 应聘者id
     */
    @TableField(value = "a_id")
    @ApiModelProperty(value="应聘者id")
    private Integer aId;

    /**
     * 面试地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value="面试地址")
    private String address;

    /**
     * 面试时间
     */
    @TableField(value = "i_time")
    @ApiModelProperty(value="面试时间")
    private Date iTime;

    /**
     * 状态（1.邀请面试2.确认面试 3.面试结束 4.面试失败（未面试） 5.拒绝面试）
     */
    @TableField(value = "flag")
    @ApiModelProperty(value="状态（1.邀请面试2.确认面试 3.面试结束 4.面试失败（未面试） 5.拒绝面试）")
    private Integer flag;

    /**
     * 状态0.删除1.正常
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态0.删除1.正常")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_RI_ID = "ri_id";

    public static final String COL_A_ID = "a_id";

    public static final String COL_ADDRESS = "address";

    public static final String COL_I_TIME = "i_time";

    public static final String COL_FLAG = "flag";

    public static final String COL_STATUS = "status";

    public Interview(Integer id, Integer flag) {
        this.id = id;
        this.flag = flag;
    }
}
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
    * 地址详情表
    */
@ApiModel(value="com-example-boss-entity-AddressInfo")
@Data
@TableName(value = "address_info")
public class AddressInfo implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 区id
     */
    @TableField(value = "d_id")
    @ApiModelProperty(value="区id")
    private Integer dId;

    /**
     * 详细地址
     */
    @TableField(value = "address_info")
    @ApiModelProperty(value="详细地址")
    private String addressInfo;

    /**
     * 状态 0.删除1.正常
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态 0.删除1.正常")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_D_ID = "d_id";

    public static final String COL_ADDRESS_INFO = "address_info";

    public static final String COL_STATUS = "status";
}
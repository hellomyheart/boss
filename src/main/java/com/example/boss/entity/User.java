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

@ApiModel(value = "com-example-boss-entity-User")
@Data
@TableName(value = "`user`")
public class User implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "id")
    private Integer id;

    /**
     * 手机号
     */
    @TableField(value = "phone")
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 密码
     */
    @TableField(value = "password")
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    @ApiModelProperty(value = "昵称")
    private String nickname;

    /**
     * 头像
     */
    @TableField(value = "icon")
    @ApiModelProperty(value = "头像")
    private String icon;

    /**
     * 标志位 0 未激活，1求职者，2招聘者
     */
    @TableField(value = "status")
    @ApiModelProperty(value = "标志位 0 未激活，1求职者，2招聘者")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "createtime")
    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    /**
     * 修改时间
     */
    @TableField(value = "updatetime")
    @ApiModelProperty(value = "修改时间")
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_PHONE = "phone";

    public static final String COL_EMAIL = "email";

    public static final String COL_PASSWORD = "password";

    public static final String COL_NICKNAME = "nickname";

    public static final String COL_ICON = "icon";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public User(String phone, String email, String password, String nickname, String icon, Integer status, Date createtime, Date updatetime) {
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.icon = icon;
        this.status = status;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }
}
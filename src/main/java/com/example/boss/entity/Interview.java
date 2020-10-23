package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 22:34
 * @Description:面试表
 */
@Data
@TableName("interview")
@NoArgsConstructor
public class Interview {
    @TableId(type = IdType.AUTO)
    private int id;
    private int r_id;//招聘表id
    private int u_id;//用户id
    private String address;//面试地址
    private Date i_time;//面试时间
    private int status;//状态（1.邀请面试2.确认面试 3.面试结束 4.面试失败（未面试）5.拒绝面试 ）

    public Interview(int status) {
        this.status = status;
    }
}

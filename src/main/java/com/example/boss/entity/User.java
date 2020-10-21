package com.example.boss.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description
 * @className: User
 * @package: com.example.dingding.entity
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:33
 */
@Data
@TableName("t_user")
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1597284071733675232L;
}

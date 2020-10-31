package com.example.boss.commons.pagehelper;

import lombok.Data;

import java.io.Serializable;

/**
 * @description
 * @className: PageHelperParam
 * @package: com.example.boss.commons.pagehelper
 * @author: Stephen Shen
 * @date: 2020/10/31 上午9:18
 */
@Data
public class PageHelperParam implements Serializable {

    private static final long serialVersionUID = -4367906965245231075L;

    private Integer pageNum;
    private Integer pageSize;
}

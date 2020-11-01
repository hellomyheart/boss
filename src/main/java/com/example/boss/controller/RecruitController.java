package com.example.boss.controller;

import com.example.boss.dto.FindByType;
import com.example.boss.service.RecruitService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/31 16:44
 * @Description:
 */
@RestController
@RequestMapping("/recruit")
public class RecruitController {
    @Autowired
    private RecruitService service;

    /**无条件查询
     * 职位名称，公司名称，工资，区 查询
     * bug:根据工资区间查询不可用
     * 根据条件查找招聘信息
     * @param dto
     * @return
     */
    @GetMapping("/selectAllByType")
    public ResponseResult selectAllByType(FindByType dto){
        return service.selectAllByType(dto);
    }


}

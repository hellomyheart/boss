package com.example.boss.service;

import com.example.boss.dto.FindByType;
import com.example.boss.entity.Recruit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boss.vo.ResponseResult;

public interface RecruitService extends IService<Recruit>{

    /**职位名称，公司名称，工资，区
     * 根据条件查找招聘信息（部分有bug，根据工资区间查询不可用）
     * @param dto
     * @return
     */
    ResponseResult selectAllByType(FindByType dto);



}

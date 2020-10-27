package com.example.boss.controller;

import com.example.boss.config.SystemConfig;
import com.example.boss.dto.InterviewDto;
import com.example.boss.dto.RecruitDto;
import com.example.boss.service.RecruitService;
import com.example.boss.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RecruitController {

    @Autowired
    private RecruitService recruitService;

    /**
     * 发布招聘信息
     * @param recruitDto
     * @return
     */
    //TODO 此处需要用到令牌，去拿redis中的用户信息
    @PostMapping("/sendResume")
    public ResponseResult sendResume(HttpServletRequest request,RecruitDto recruitDto){
        return recruitService.sendResume(request.getHeader(SystemConfig.TOKEN_LOGIN),recruitDto);
    }

    /**
     * 邀请面试
     * @param interviewDto 前端传入HR选择的面试信息
     * @return 邀请状态，成功为ok
     */
    @PostMapping("/invited")
    public ResponseResult invited(InterviewDto interviewDto){
        return recruitService.invited(interviewDto);
    }

    /**
     * 申请查看应聘者简历
     * @param u_id 被查看应聘者的简历
     * @return 简历地址
     */
    //TODO 缺少相关条件
//    @PostMapping("/applyForCheck")
//    public ResponseResult applyForCheck(Integer u_id){
//        return recruitService.applyForCheck(u_id);
//    }

    /**
     * 修改招聘信息
     * @param id 被修改找您信息的id
     * @param recruitDto 前端传入的修改信息
     * @return 返回修改的状态
     */
    @PostMapping("/modifyRecruit")
    public ResponseResult modifyRecruit(HttpServletRequest request,Integer id,RecruitDto recruitDto){
        return recruitService.modifyRecruit(request.getHeader(SystemConfig.TOKEN_LOGIN),id,recruitDto);
    }

    /**
     * 删除招聘信息
     * @param id 被删除招聘信息的id
     * @return 返回删除的状态，成功返回ok,失败返回fail
     */
    @PostMapping("/deleteRecruit")
    public ResponseResult deleteRecruit(HttpServletRequest request,Integer id){
        return recruitService.deleteRecruit(request.getHeader(SystemConfig.TOKEN_LOGIN),id);
    }

    /**
     * 查询公司的所发布的所有招聘信息
     * @param id 被查询的公司id
     * @return 查询结果
     */
    @PostMapping("/selectAllRecruitByCompany")
    public ResponseResult selectAllRecruitByCompany(Integer page,Integer limit,Integer id){
        return recruitService.selectAllRecruitByCompany(page,limit,id);
    }

}

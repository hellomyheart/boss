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
     * @author lss
     * @param request
     * @param recruitDto 包含p_id职位；num招聘人数；address工作地点
     * @return 状态code值：1成功，2失败，3,登陆失败；提示信息：成功OK，失败FAIL；响应数据，没有为null
     */
    //TODO 此处需要用到令牌，去拿redis中的用户信息
    @PostMapping("/sendResume")
    public ResponseResult sendResume(HttpServletRequest request,RecruitDto recruitDto){
        return recruitService.sendResume(request.getHeader(SystemConfig.TOKEN_LOGIN),recruitDto);
    }

    /**
     * 邀请面试
     * @author lss
     * @param interviewDto 包含address面试地址；i_time面试时间；status面试状态
     * @return 状态code值：1成功，2失败，3,登陆失败；提示信息：成功OK，失败FAIL；响应数据，没有为null
     */
    @PostMapping("/invited")
    public ResponseResult invited(InterviewDto interviewDto){
        return recruitService.invited(interviewDto);
    }

    /**
     * 申请查看应聘者简历
     * @author lss
     * @param u_id 简历对应应聘者id
     * @return 简历地址
     */
    //TODO 缺少相关条件
//    @PostMapping("/applyForCheck")
//    public ResponseResult applyForCheck(Integer u_id){
//        return recruitService.applyForCheck(u_id);
//    }

    /**
     * 修改招聘信息
     * @author lss
     * @param id 被修改招聘信息id
     * @param recruitDto 招聘信息修改参数
     * @return 状态code值：1成功，2失败，3,登陆失败；提示信息：成功OK，失败FAIL；响应数据，没有为null
     */
    @PostMapping("/modifyRecruit")
    public ResponseResult modifyRecruit(HttpServletRequest request,Integer id,RecruitDto recruitDto){
        return recruitService.modifyRecruit(request.getHeader(SystemConfig.TOKEN_LOGIN),id,recruitDto);
    }

    /**
     * 删除招聘信息
     * @author lss
     * @param request 承载请求头的令牌
     * @param id 被删除招聘信息的id
     * @return 状态code值：1成功，2失败，3,登陆失败；提示信息：成功OK，失败FAIL；响应数据，没有为null
     */
    @PostMapping("/deleteRecruit")
    public ResponseResult deleteRecruit(HttpServletRequest request,Integer id){
        return recruitService.deleteRecruit(request.getHeader(SystemConfig.TOKEN_LOGIN),id);
    }

    /**
     * 查询公司的所发布的所有招聘信息
     * @author lss
     * @param page 页数
     * @param limit 页容量
     * @param id 被查询的公司id
     * @return 状态code值：1成功，2失败，3,登陆失败；提示信息：成功OK，失败FAIL；响应数据，没有为null
     */
    @PostMapping("/selectAllRecruitByCompany")
    public ResponseResult selectAllRecruitByCompany(Integer page,Integer limit,Integer id){
        return recruitService.selectAllRecruitByCompany(page,limit,id);
    }

}

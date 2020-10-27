package com.example.boss.service;

import com.example.boss.dto.InterviewDto;
import com.example.boss.dto.RecruitDto;
import com.example.boss.vo.ResponseResult;

public interface RecruitService {

    ResponseResult sendResume(String token,RecruitDto recruitDto);

    ResponseResult invited(InterviewDto interviewDto);

    ResponseResult modifyRecruit(String token,Integer id,RecruitDto recruitDto);

    ResponseResult deleteRecruit(String token,Integer id);

    ResponseResult selectAllRecruitByCompany(Integer page,Integer limit,Integer id);

}

package com.example.boss.service;

import com.example.boss.dto.RecruitDto;
import com.example.boss.vo.ResponseResult;

public interface RecruitService {

    ResponseResult sendResume(RecruitDto recruitDto);

}

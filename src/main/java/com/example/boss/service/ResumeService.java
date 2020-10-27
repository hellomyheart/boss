package com.example.boss.service;

import com.example.boss.dto.ResumeDto;
import com.example.boss.dto.Resumeupdatedto;
import com.example.boss.entity.Resume;
import com.example.boss.vo.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ProjectName: boss
 * @Author: GSL
 * @Time: 2020/10/22 21:26
 * @Description:
 */
public interface ResumeService {
    /**
     * 增加简历信息
     * @param token
     * @param address
     * @return
     */
    ResponseResult add(String token, String address);

    /**
     * 查询简历
     * @param token
     * @return
     */
    ResponseResult select(String token);

    /**
     * 修改简历
     * @param token
     * @param
     * @return
     */
    ResponseResult update(String token, String address);

    /**
     * 删除简历/修改状态
     * @param token
     * @return
     */
    ResponseResult delete(String token);

    /**
     * 上传简历附件
     * @param token
     * @param file
     * @return
     */
    ResponseResult insert(String token, MultipartFile file) throws IOException;
}

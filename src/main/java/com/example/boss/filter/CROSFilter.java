package com.example.boss.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @description
 * @className: CROSFilter
 * @package: com.example.dingding.filter
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:39
 */
@WebFilter("/*")
public class CROSFilter implements Filter {
    /**
     * 过滤
     *
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

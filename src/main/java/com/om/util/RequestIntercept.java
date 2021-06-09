package com.om.util;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public class RequestIntercept implements HandlerInterceptor {

    private final static Logger log = Logger.getLogger(RequestIntercept.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = request.getHeader(com.zrk.util.JWTUtil.TOKEN_HEADER);
        if(token==null){
            return false;
        }
        HashMap<String, String> hashMap = com.zrk.util.JWTUtil.VerifierToken(token);
        com.zrk.util.JWTUtil.userManager.set(hashMap);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        com.zrk.util.JWTUtil.userManager.remove();
    }
}


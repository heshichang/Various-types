package com.he.boot.config;

import com.baomidou.kisso.annotation.Action;
import com.baomidou.kisso.annotation.Login;
import com.he.boot.util.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @Author: 和世昌
 * @date: 2019/1/12
 */
@Component
public class LoginHander implements HandlerInterceptor {

    @Autowired
    private TokenUtils tokenUtils;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod)handler;
            Method method = handlerMethod.getMethod();
            Login login = method.getAnnotation(Login.class);
            if(login != null){
                if(login.action() == Action.Skip){
                    return true;
                }

            }
            String token = request.getHeader("token");
            if(token == null){
                return false;
            }else {
                if(tokenUtils.checkToken(token)){
                    return true;
                }else {
                    return false;
                }
            }
        }

        return false;
    }
}

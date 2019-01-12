package com.he.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @Author: 和世昌
 * @date: 2019/1/12
 */
@Configuration
public class LoginConfig extends WebMvcConfigurationSupport {

    @Autowired
    private LoginHander loginHander;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(loginHander);
        interceptorRegistration.addPathPatterns("/**");
        String [] url = new String[]{"/error","/login"};
        interceptorRegistration.excludePathPatterns(url);
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/static/**");
    }
}

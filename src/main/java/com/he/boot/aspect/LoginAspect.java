package com.he.boot.aspect;

import com.he.boot.entity.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/10/30 16:16
 */
@Aspect
@Component
public class LoginAspect {

    @AfterReturning(returning = "a",pointcut = "@annotation(com.he.boot.aspect.annotation.LoginAnnotation)")
    public String testAspect(String a){
        System.out.println("shishi"+a);
        return a;
    }
}

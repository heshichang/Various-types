package com.he.boot.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 和世昌
 * @CreateDate: 2018/11/28
 */
@Slf4j
public class UserProxy implements Function{

    private User user;
    public UserProxy(User user){
        this.user = user;
    }
    @Override
    public void doThing() {

        if(user.getPermission().equals("管理员")){
            user.doThing();
        }else{
            log.info("sorry,你没有权限！");
        }

    }
}

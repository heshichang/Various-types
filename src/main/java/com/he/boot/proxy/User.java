package com.he.boot.proxy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 和世昌
 * @CreateDate: 2018/11/28
 */
@Slf4j
@Data
public class User implements Function{

    private String permission;

    @Override
    public void doThing() {
        log.info("我有权限，做了一件事");
    }
}

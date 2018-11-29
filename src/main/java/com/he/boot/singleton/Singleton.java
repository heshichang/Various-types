package com.he.boot.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 懒汉式
 * @Author: 和世昌
 * @CreateDate: 2018/11/28
 */
@Slf4j
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton(){
        log.info("实例化");
    }

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }


}

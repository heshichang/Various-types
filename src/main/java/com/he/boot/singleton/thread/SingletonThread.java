package com.he.boot.singleton.thread;

import com.he.boot.singleton.Singleton;
import com.he.boot.singleton.Singleton1;
import com.he.boot.singleton.Singleton2;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 和世昌
 * @CreateDate: 2018/11/28
 */
@Slf4j
public class SingletonThread implements Runnable{
    @Override
    public void run() {
            synchronized (SingletonThread.class){
                log.info(Singleton2.INSTANCE.hashCode()+"");
                // log.info(Singleton1.getSingleton1().hashCode()+Thread.currentThread().getName());
            }
    }
}

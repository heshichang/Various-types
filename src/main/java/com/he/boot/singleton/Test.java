package com.he.boot.singleton;

import com.he.boot.proxy.User;
import com.he.boot.proxy.UserProxy;
import com.he.boot.singleton.thread.SingletonThread;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 和世昌
 * @CreateDate: 2018/11/28
 */
public class Test {

    public static void main(String[] args) {
        //测试单例
/*        SingletonThread singletonThread = new SingletonThread();
        List<Thread> singletonThreadList = new ArrayList<>();
        for(int i = 1; i<6;i++){
            Thread thread = new Thread(singletonThread,"线程"+i);
            singletonThreadList.add(thread);
        }
        singletonThreadList.forEach(th->{
            th.start();
        });*/

        //测试静态代理
        User user = new User();
        user.setPermission("普通用户");
        UserProxy userProxy = new UserProxy(user);
        userProxy.doThing();
    }

}

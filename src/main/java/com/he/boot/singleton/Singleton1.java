package com.he.boot.singleton;

/**
 * 静态内部类
 * @Author: 和世昌
 * @CreateDate: 2018/11/28
 */
public class Singleton1 {

    private Singleton1(){}

    private static class SingletonInstance{
        private static final Singleton1 getSingleton1 = new Singleton1();
    }

    public static Singleton1 getSingleton1(){
        return SingletonInstance.getSingleton1;
    }



}

package com.he.boot.entity;

import java.util.List;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/10/29 11:23
 */
public class Generic<A> {

    List<A> lsit;

    public List<A> getLsit() {
        return lsit;
    }

    public void setLsit(List<A> lsit) {
        this.lsit = lsit;
    }
}

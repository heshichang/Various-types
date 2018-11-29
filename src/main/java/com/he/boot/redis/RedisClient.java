package com.he.boot.redis;

import redis.clients.jedis.Jedis;

import java.util.UUID;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/11/6 19:48
 */
public class RedisClient implements Runnable{
    private Jedis jedis;
    private String lockKey;
    private int expireTime;
    private Object object = new Object();
    public RedisClient(Jedis jedis, String lockKey, int expireTime) {
        this.jedis = jedis;
        this.lockKey = lockKey;
        this.expireTime = expireTime;
    }

    @Override
    public void run() {
            while (true) {
                System.out.println(Thread.currentThread().getName() + "下订单");
                synchronized (object) {
                    if (RedisLock.tryGetDistributedLock(jedis, lockKey, Thread.currentThread().getName(), expireTime)) {
                        System.out.println(Thread.currentThread().getName() + "加锁成功");
                        System.out.println(Thread.currentThread().getName() + "生成订单号");
                        if (RedisTool.releaseDistributedLock(jedis, lockKey, Thread.currentThread().getName())) {
                            System.out.println(Thread.currentThread().getName() + "解锁成功");
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + "加锁失败");
                    }
                    try {
                        object.notify();
                        Thread.sleep(2000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
    }
}

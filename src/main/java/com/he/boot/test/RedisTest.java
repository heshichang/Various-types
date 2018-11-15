package com.he.boot.test;

import com.he.boot.redis.RedisClient;
import com.he.boot.redis.RedisClient1;
import com.he.boot.util.SerializeUtil;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import redis.clients.jedis.Jedis;

import java.util.UUID;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/11/3 13:54
 */
public class RedisTest {
    private static volatile boolean permission = true;

    public static void main(String[] args) {

        Jedis jedis = new Jedis("localhost",6379);
        Jedis jedis1 = new Jedis("localhost",6379);
        //RedisClient redisClient = new RedisClient(jedis,"aple",4000);
        RedisClient1 redisClient = new RedisClient1(jedis,"order",2000);
        RedisClient1 redisClient1 = new RedisClient1(jedis1,"order",2000);
        Thread c = new Thread(redisClient,"顾客1");
        Thread c1 = new Thread(redisClient1,"顾客2");
        c1.start();
        c.start();


    }


}

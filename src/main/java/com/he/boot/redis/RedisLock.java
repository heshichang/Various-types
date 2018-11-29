package com.he.boot.redis;

import redis.clients.jedis.Jedis;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/11/6 16:12
 */
public class RedisLock {

    private static final String LOCK_SUCCESS = "OK";
    //该参数有两个值，NX 代表仅在尚不存在的情况下设置密钥，XX 代表不管存不存在都要设置
    private static final String SET_IF_NOT_EXIST = "NX";
    //该参数有两个值，PX代表毫秒，EX代表秒
    private static final String SET_WITH_EXPIRE_TIME = "PX";



    /**
     * 尝试获取分布式锁
     * @param jedis Redis客户端
     * @param lockKey 锁
     * @param requestId 请求标识
     * @param expireTime 超期时间
     * @return 是否获取成功
     */
    public static boolean tryGetDistributedLock(Jedis jedis, String lockKey, String requestId, int expireTime) {
        String result = jedis.set(lockKey, requestId, SET_IF_NOT_EXIST, SET_WITH_EXPIRE_TIME, expireTime);
        if(LOCK_SUCCESS.equals(result)) {
            return true;
        }
        return false;
    }





}

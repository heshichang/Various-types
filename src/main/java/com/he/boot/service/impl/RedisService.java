package com.he.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/11/3 12:48
 */
@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    private boolean locked = false;
    /**
     * @Description set key
     * @Author 和世昌
     * @Date 2018/11/3 13:17
     * @method
     */
    public boolean set(String key,Object value){
        boolean result = false;
        try {
            ValueOperations<Serializable,Object> valueOperations = redisTemplate.opsForValue();
            valueOperations.set(key,value);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public Object get(String key){
        Object result = null;
        try {
            ValueOperations<Serializable,Object> valueOperations = redisTemplate.opsForValue();
            result = valueOperations.get(key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @Description hashset
     * @Author 和世昌
     * @Date 2018/11/3 13:17
     * @method
     */
    public void hmset(String key,Object hashKey,Object value){
        HashOperations<String,Object,Object> hash = redisTemplate.opsForHash();
        hash.put(key,hashKey,value);
    }

    /**
     * @Description 获取hash
     * @Author 和世昌
     * @Date 2018/11/3 13:25
     * @method
     */
    public Object hmGet(String key, Object hashKey){
        HashOperations<String, Object, Object>  hash = redisTemplate.opsForHash();
        return hash.get(key,hashKey);
    }

    /**
     * @Description 集合添加
     * @Author 和世昌
     * @Date 2018/11/3 14:02
     * @method 
     */
    public void lPush(String k,Object v){
        ListOperations<String, Object> list = redisTemplate.opsForList();
        list.rightPush(k,v);
    }
    
    /**
     * @Description 集合获取
     * @Author 和世昌
     * @Date 2018/11/3 14:03
     * @method 
     */
    public List<Object> lRange(String k){
        ListOperations<String,Object> operations = redisTemplate.opsForList();
        return operations.range(k,0,-1);
    }

    /**
     * @Description 删除某个key
     * @Author 和世昌
     * @Date 2018/11/3 14:35
     * @method
     */
    public void delete(String key){
        boolean isHave = redisTemplate.hasKey(key);
        if(isHave){
            redisTemplate.delete(key);
        }
    }

    /**
     * @Description set
     * @Author 和世昌
     * @Date 2018/11/3 14:49
     * @method
     */
    public void add(String key,Object value){
        SetOperations<String,Object> operations = redisTemplate.opsForSet();
        operations.add(key,value);
    }

    /**
     * @Description set
     * @Author 和世昌
     * @Date 2018/11/3 14:49
     * @method
     */
    public Set<Object> getset(String key){
        SetOperations<String,Object> operations = redisTemplate.opsForSet();
        return  operations.members(key);
    }

    /**
     * @Description redis锁
     * @Author 和世昌
     * @Date 2018/11/3 15:35
     * @method
     */
    public synchronized boolean lock(String lockKey){
        /*该方法会在没有key时，设置key;存在key时返回false；因此可以通过该方法及设置key的有效期，判断是否有其它线程持有锁*/
        Boolean success = redisTemplate.opsForValue().setIfAbsent(lockKey,"123");
        if(success != null && success){
            redisTemplate.expire(lockKey,3,TimeUnit.SECONDS);
            locked = true;
        }else{
            locked = false;
        }
        return locked;
    }


}

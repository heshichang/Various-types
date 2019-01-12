package com.he.boot.util;

import com.he.boot.common.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


@Component
public class TokenUtils {

  /**
   * 注入时指定K、V类型都为String
   */
  @Autowired
  private RedisTemplate<String, String> redisTemplate;

  private final Integer TWO = 2;

  /**
   * 生成一个令牌
   *
   * @param userId 用户ID
   * @return 返回令牌
   */
  public String createToken(int userId) {
    //生成token
    String uuId = UUIDUtils.getUUID();
    //将token存入redis
    String key = userId + "_token";
    String token = userId + "_" + uuId;
    redisTemplate.opsForValue().set(key, token, Common.TOKEN_EXPIRE_HOUR, TimeUnit.HOURS);
    return token;
  }

  /**
   * 检查token是否正确
   *
   * @param token 令牌
   * @return true正确;false失败
   */
  public boolean checkToken(String token) {
    //解析出userId和uuid
    if (token == null || "".equals(token)) {
      return false;
    }
    String[] arr1 = token.split("_");
    if (arr1.length != TWO) {
      return false;
    }
    //根据redis进行检查
    String key = arr1[0] + "_token";
    String redisTaken = (String) redisTemplate.opsForValue().get(key);
    if (redisTaken == null) {
      return false;
    }
    if (!token.equals(redisTaken)) {
      return false;
    }
    //返回检测结果,更新token时间
    redisTemplate.opsForValue().set(key, token, Common.TOKEN_EXPIRE_HOUR, TimeUnit.HOURS);
    return true;
  }

  /**
   * 注销Token
   *
   * @param token 令牌
   * @return true正确;false失败
   */
  public boolean clearToken(String token) {
    //解析出userId和uuid
    if (token == null || "".equals(token)) {
      return false;
    }
    String[] arr1 = token.split("_");
    if (arr1.length != TWO) {
      return false;
    }
    //根据redis进行检查
    String key = arr1[0] + "_token";
    String redisTaken = redisTemplate.opsForValue().get(key);
    if (redisTaken == null) {
      return false;
    }
    //注销token
    redisTemplate.delete(key);
    return true;
  }

}

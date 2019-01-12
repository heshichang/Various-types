package com.he.boot;

import java.util.HashMap;
import java.util.Random;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 和世昌
 * @date: 2018/12/18
 */
@Slf4j
public class NumberTest {

  public static void main(String[] args) {


    HashMap<String,Double> goods = new HashMap<>();
    goods.put("手机",0.05);
    goods.put("耳机",0.2);
    Random random = new Random();
    Double pro ;
    double phone = 0;
    double er = 0;
    int count = 10000;
    for(int i = 0;i<count;i++){
      pro = random.nextDouble();
      while (pro==0d){
        pro = random.nextDouble();
      }
      if(pro>0 && pro<=0.05){
        phone++;
      }
      if(pro>0.3 && pro<=0.6){
        er++;
      }
    }

    log.info("手机中奖概率"+(phone/count));
    log.info("耳机中奖概率"+(er/count));

    //1,1,2,3,5,8,13,21
    System.out.println(getNvalue(8));


  }

  public static int getNvalue(int n){
    if(n==1 || n==2){
      return 1;
    }else {
      return getNvalue(n-1)+getNvalue(n-2);
    }

  }
}

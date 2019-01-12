package com.he.boot.timer;

import com.he.boot.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: 和世昌
 * @date: 2018/12/13
 */

@Configuration
@EnableScheduling
@Slf4j
public class Test {

  @Autowired
  private StudentService studentService;
 // @Scheduled(cron = "0 48 17 ? * *" )
//  @Scheduled(cron = "0/4 * * * * *" )
//  public void te(){
//    log.info( studentService.selectAll()+"");
//    LocalDateTime localDateTime =LocalDateTime.now();
//    System.out.println("当前时间为:" + localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//  }
}

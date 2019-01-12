package com.he.boot;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.he.boot.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/10/24 11:23
 */
@Slf4j
public class Test {


    @org.junit.Test
    public void toJson() {

//            switch ("nii"){
//                case "wo":
//                    System.out.println("wo");
//                    break;
//                case "ni":
//                    System.out.println("ni");
//                    break;
//                case "ta":
//                    System.out.println("ta");
//                    break;
//                default:
//                    System.out.println("没找到");
//                    break;
//            }
//            List<String> list = new ArrayList<>();
//            list.add("a");
//            list.add("b");
//            list.forEach(ls->{
//                System.out.println(ls);
//            });
//            System.out.println("abc"=="abc");
//        Date date = new Date();
//        int b = 0;
//
//        Date date1 = new Date();
//
//        System.out.println((date1.getTime()-date.getTime()));

//      String[] atp = {"Rafael Nadal", "Novak Djokovic",
//              "Stanislas Wawrinka",
//              "David Ferrer","Roger Federer",
//              "Andy Murray","Tomas Berdych",
//              "Juan Martin Del Potro"};
//      List<String> players =  Arrays.asList(atp);
//
//      // 以前的循环方式
//      for (String player : players) {
//        System.out.print(player + "; ");
//      }
//
//// 使用 lambda 表达式以及函数操作(functional operation)
//      players.forEach((player) -> System.out.print(player + "; "));
//
//// 在 Java 8 中使用双冒号操作符(double colon operator)
//      players.forEach(System.out::println);
//
//      Runnable race2 = () -> log.info("0000");System.out.println("000");
//      race2.run();
//      new Thread(()->{
//        log.info("0----");
//      }).start();
//
//
//    }
//
//    public void add(List<String> list){
//        list.add("2");
//    }
//      List<Student> students = new ArrayList<>();
//      for(int i = 0;i<5;i++){
//        Student student = new Student();
//        student.setSid(i);
//        student.setSname(""+i);
//        students.add(student);
//      }
//      students.stream().filter((p)->(p.getSid()>0)).forEach((p)->System.out.println(p.getSid()));
//
//      System.out.println(students);
////      students.forEach(p->{
////        log.info(p.getSid()+"");
////      });

      Calendar c = Calendar.getInstance();
      System.out.println(c.get(Calendar.DATE));
      System.out.println(c.get(Calendar.HOUR_OF_DAY));
      System.out.println(c.get(Calendar.MINUTE));
    }
}

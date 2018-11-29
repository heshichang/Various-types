package com.he.boot;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.he.boot.entity.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/10/24 11:23
 */
public class Test {


    @org.junit.Test
    public void toJson(){

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
        Date date = new Date();
        int b = 0;

        Date date1 = new Date();

        System.out.println((date1.getTime()-date.getTime()));



    }

    public void add(List<String> list){
        list.add("2");
    }


}

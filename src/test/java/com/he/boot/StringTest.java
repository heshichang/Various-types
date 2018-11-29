package com.he.boot;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description:
 * @Author: 和世昌
 * @CreateDate: 2018/11/7 11:01
 */
@Slf4j
public class StringTest {

    @Test
    public void SlipString(){
//        String date = "id:'1',name:'呵呵'";
//        String [] aa = date.split(",");
//        System.out.println(aa[0]);
//        int begin = date.indexOf(":");
//        int end = date.indexOf(",");
//        System.out.println(date.substring(begin,end));
//        UUID  a = UUID.randomUUID();
//        String b = a.toString();
//        System.out.println(b);
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

//        String c = "五险一金";
//        String [] a = c.split(",");
//        System.out.println(a[0]);;

        /*b=b.replaceAll("\r","");
        b=b.replaceAll("\n","");
        b=b.trim();
        b=b.replaceAll("\t\n","");
        System.out.println(a);
        System.out.println(b);
        Pattern pattern = Pattern.compile("\\s*|\t|\r|\n");
        Matcher matcher  = pattern.matcher(a);
        String strNoBlank = matcher.replaceAll("");
        System.out.println(strNoBlank);*/

//        String a = "fjas;jk<br  />";
//        System.out.println(a.replaceAll("<br\\s*/>", ""));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list.removeAll(list1);

        log.info(""+list.get(0));

    }
}

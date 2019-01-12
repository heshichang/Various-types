package com.he.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.lang.System.setOut;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.stream().filter(s -> s == 4).findFirst().get();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(5);
        list.sort((str,str1)->str-str1);
        list.forEach((l)->out.println(l));
        Consumer<String> consumer = x->{out.println(x);};
        consumer.accept("123");
        //(int x,int y)-> x+y
//        list.removeIf(l->l.length()>1);
//        System.out.println(list.size());
//        list.forEach(l->out.println(l.length()));
//        Predicate<String> predicate = n->n.contains("发");
//        Predicate<String> predicate1 = n->n.contains("f");
//        List<String> collect = list.stream().filter(predicate.and(predicate1)).collect(Collectors.toList());
//        collect.forEach(c->out.println(c));
    }

}

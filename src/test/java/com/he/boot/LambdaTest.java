package com.he.boot;

import com.he.boot.entity.Dept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @Author: 和世昌
 * @date: 2019/1/12
 */
public class LambdaTest {

    public static void main(String[] args) {
        List<Dept> depts = new ArrayList<>();
        Dept dept = new Dept();
        dept.setSalary(4000);
        dept.setName("也");
        Dept dept1 = new Dept();
        dept1.setSalary(2000);
        dept1.setName("吧");
        Dept dept2 = new Dept();
        dept2.setSalary(3000);
        dept2.setName("查");
        depts.add(dept);
        depts.add(dept1);
        depts.add(dept2);
        Consumer<Dept> consumer = c->{c.setSalary(c.getSalary()+(c.getSalary()*0.05));};
        depts.forEach(consumer);
        Consumer<Dept> consumer1 = c1->{
            System.out.println(c1.getSalary());
        };
        depts.forEach(consumer1);
        depts.stream().filter(d->d.getSalary()>2000).forEach(d->{
            System.out.println(d.getName());
        });
        //输入空，返回一个值
        Supplier<Integer> supplier = ()->{
            return 0;
        };
        System.out.println(supplier.get());

//        depts.stream().sorted((d1,d2)->d1.getName().compareTo(d2.getName())).limit(2).collect(Collectors.toList());
//        depts.forEach(d->{
//            System.out.println(d.getName());
//        });
        //Dept dept3 = depts.stream().min((d1, d2) -> d1.getSalary() - d2.getSalary()).get();
        String a= "jqcAdmin-sso=eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiI0IiwiaXAiOiIxNDAuMjA2LjMyLjM4IiwidWEiOiJ7XCJpZFwiOjQsXCJhY2NvdW50XCI6XCJ4dXlhbmp1blwiLFwiZnVsbG5hbWVcIjpcInh1eWFuanVuXCIsXCJwYXNzd29yZFwiOlwiXCIsXCJwbGFpblBhc3N3b3JkXCI6XCIxMjM0NTZcIixcInNhbHRcIjpcIlwiLFwiZW5hYmxlZFwiOjEsXCJhcmVhSWRcIjpudWxsLFwidmlzaWJsZVBlcnNvbm5lbFwiOjEsXCJjcmVhdGVUaW1lXCI6MTU0NTg5NzYyMDAwMH0iLCJpYXQiOjE1NDcyNjkwMzV9.LJ22C8nAt0PNWVjitA6BEqcDvlBOoH0ogLDeTMDy00FiYRtSNYqTKjligiFXCsTHEdRbsFpnAEX-1CDwHPxemw;Max-Age=7200;domain=testgeek.com;path=/;HTTPOnly;";
        String b="jqcAdmin-sso=eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiI0IiwiaXAiOiIxNDAuMjA2LjMyLjM4IiwidWEiOiJ7XCJpZFwiOjQsXCJhY2NvdW50XCI6XCJ4dXlhbmp1blwiLFwiZnVsbG5hbWVcIjpcInh1eWFuanVuXCIsXCJwYXNzd29yZFwiOlwiXCIsXCJwbGFpblBhc3N3b3JkXCI6XCIxMjM0NTZcIixcInNhbHRcIjpcIlwiLFwiZW5hYmxlZFwiOjEsXCJhcmVhSWRcIjpudWxsLFwidmlzaWJsZVBlcnNvbm5lbFwiOjEsXCJjcmVhdGVUaW1lXCI6MTU0NTg5NzYyMDAwMH0iLCJpYXQiOjE1NDcyNjkwMzV9.LJ22C8nAt0PNWVjitA6BEqcDvlBOoH0ogLDeTMDy00FiYRtSNYqTKjligiFXCsTHEdRbsFpnAEX-1CDwHPxemw;Max-Age=7200;domain=testgeek.com;path=/;HTTPOnly;";
        System.out.println(a.equals(b));
    }
}

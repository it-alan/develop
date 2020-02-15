package com.alan.jdk8;

import java.util.Arrays;
import java.util.List;

public class SwingTest {
    public static void main(String[] args) {
        System.out.println("hello world");

        List<String> list = Arrays.asList("a", "b", "c");
       /* list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("-----------------");
        list.forEach((l) -> {
            System.out.println(l);
        });

        System.out.println("------------");
        list.forEach(System.out::print);
    */
        list.stream().map(
                (String s) -> s.toUpperCase()
        ).forEach(s -> System.out.println(s));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");
        list.stream().map(String :: toUpperCase).forEach(s -> System.out.println(s));
        list.stream().map(String :: toUpperCase).forEach(System.out::print);
    }
}

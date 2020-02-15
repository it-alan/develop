package com.alan.jdk8.lambda;

public class Test1 {
    public static void main(String[] args) {

        String s = "111";
        new Ketlle1().fire(new Kettle() {
            @Override
            public String boil() {
                System.out.println("ketlle1 boile water by fire");
                return "aa";
            }
        });
        System.out.println("======================");
        new Ketlle1().fire(
                Test1::boil
        );
    }

    private static String boil() {
        return "";
    }
}

class Ketlle1 {

    public void fire (Kettle k) {
        String a = k.boil();
        System.out.println("here is kettle1!!!" + a);
    }
}
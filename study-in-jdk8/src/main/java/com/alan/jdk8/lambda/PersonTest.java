package com.alan.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("a", "20");
        Person p2 = new Person("b", "20");
        Person p3 = new Person("a", "19");
        List<Person> personList = Arrays.asList(p1, p2, p3);
//        personList.stream().forEach(i -> System.out.println(i));
        /*List<Person> newList = personList.stream()
                .filter(i -> i.getName().equals("a"))
                .collect(Collectors.toList());
        newList.stream().forEach(i -> System.out.println(i));*/
//        List<Person> newList = getPersonByAge("20", personList);
//        newList.forEach(i -> System.out.println(i));
        Predicate<String> p = s -> s.length() > 2;
        System.out.println(p.test("abc"));
    }

    public static List<Person> getPersonByAge(String age, List<Person> personList) {
        BiFunction<String, List<Person>, List<Person>> biFunction = (ageOfPersion, list) -> {
          return personList.stream()
                  .filter(i -> i.getAge().equals(age))
                  .collect(Collectors.toList());
        };
        return biFunction.apply(age, personList);
    }
}

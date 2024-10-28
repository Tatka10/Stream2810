package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 5, 6, 7, 8, 9, 4, 5, 4, 3, 7};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);
        Stream<Integer> stream = list1.stream();
        Stream<Integer> stream1 = list1.stream();
        stream.filter(x -> x > 5).forEach(System.out::println);//(x-> Sout(x))
        //stream1.filter(x->x>5).map(x-> x+1).forEach(System.out::println);//(x-> Sout(x))
        //stream1.filter(x -> x > 5).limit(3).forEach(System.out::println); //первые 3 элемента
        //stream1.skip(3).limit(3).forEach(System.out::println);
        // stream1.sorted().forEach(System.out::println);
        //stream1.sorted().distinct().forEach(System.out::println);
        int a= (int) stream1.distinct().count();
        System.out.println(a);
    }
}

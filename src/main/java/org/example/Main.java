package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer [] arr = {1,4,5,6,7};
        ArrayList <Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);
        Stream <Integer> stream = list1.stream();
        stream.filter(x->x>5).forEach(System.out::println);//(x-> Sout(x))

        }
    }

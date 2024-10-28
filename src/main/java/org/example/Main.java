package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        //System.out.println(list1);
        //Stream<Integer> stream = list1.stream();
        //Stream<Integer> stream1 = list1.stream();
        //stream.filter(x -> x > 5).forEach(System.out::println);//(x-> Sout(x))
        //stream1.filter(x->x>5).map(x-> x+1).forEach(System.out::println);//(x-> Sout(x))
        //stream1.filter(x -> x > 5).limit(3).forEach(System.out::println); //первые 3 элемента
        //stream1.skip(3).limit(3).forEach(System.out::println);
        // stream1.sorted().forEach(System.out::println);
        //stream1.sorted().distinct().forEach(System.out::println);
        //int a= (int) stream1.distinct().count(); - отсортировал дубли, и посчитал количество элементов
        //System.out.println(a);
        //int res = stream1.limit(4).distinct().reduce(0,(acc,x)->acc+x); //acc - переменная для накопления суммы
        //System.out.println(res);
        //Упр.1. Создать ArrayList с числами. Отфильтровать только четные числа
        // потом возвести их вквадрат, потом оставить только первые три элемента
        // и вывести в консоль.
        Integer[] arr = {1, 4, 5, 6, 7};
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(arr));
        Integer[] in = {1, 4, 3, 100, 34, 16, 6, 8};
        String[] mass = {"Who", "you", "are", "Bring", "me", "Popcorn", "Cocacola"};
       // System.out.println(metod(mass));
        System.out.println(metod2(arr1));

        //ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(in));
        //Stream<Integer> str = ar.stream();
        //str.filter(x -> x % 2 == 0).map(x -> x * x).limit(3).forEach(System.out::println);
        //Упр.2. Создать метод, который принимает массив строк, создает stream
        // и возвращает количество слов, которые длиннее четырех символов. Покрыть тестами.
    }

    public static int metod(String[] mass) {
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(mass));
        Stream<String> str1 = arr1.stream();
        long b = str1.filter(x -> x.length() > 4).count();


        return (int) b;
    }

    //Упр.3. Создать метод, который принимает массив чисел, создает стрим и подсчитывает,
    // сколько в массиве чисел, больше заданного значения (например > 5). Покрыть тестами.
    public static int metod1(Integer[] in) {
        Stream<Integer> str2 = Arrays.stream(in);
        long count = str2.filter(x -> x > 5).count();

        return (int) count;
    }

    //Упр.4. Создать метод, который принимает ArrayList с числами,
    // создает stream и подсчитывает суммувсех чисел(метод reduce),
    // результат возвращает. Покрыть тестами.
    public static int metod2(ArrayList<Integer> arr) {
        Stream<Integer> str = arr.stream();
        int sum = str.reduce(0, (a, x) -> a + x);


        return sum;
    }
}


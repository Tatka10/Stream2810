import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

import static org.example.Main.*;

public class Testmetod {
    @Test
    public void test1() {
        String[] mass = {"Palett", "Loshadka", "Korova"};
        Assertions.assertEquals(3, metod(mass));
    }

    @Test
    public void test2() {
        String[] mass = {};
        Assertions.assertEquals(0, metod(mass));
    }

    @Test
    public void test3() {
        String[] mass = {"Thre"};
        Assertions.assertEquals(0, metod(mass));
    }

    @Test
    public void test4() {
        Integer[] arr = {6, 7, 8};
        Assertions.assertEquals(3, metod1(arr));

    }

    @Test
    public void test5() {
        Integer[] arr = {};
        Assertions.assertEquals(0, metod1(arr));

    }

    @Test
    public void test6() {
        Integer[] arr = {1, 4, 2, 0};
        Assertions.assertEquals(0, metod1(arr));
    }

    @Test
    public void test7() {
        Integer[] arr = {1, 6,};
        Assertions.assertEquals(1, metod1(arr));
    }
    @Test
    public void test8(){
        ArrayList<Integer>arr= new ArrayList<>();
        Assertions.assertEquals(0,metod2(arr));
    }
    @Test
    public void test9(){
        Integer [] intt = {};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(intt));
        Assertions.assertEquals(0,metod2(arr));
    }
    @Test
    public void test10 (){
        Integer [] intt = {3,5,7,8};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(intt));
        Assertions.assertEquals(23,metod2(arr));
    }
    @Test
    public void tes11 (){
        ArrayList<Integer> in = new ArrayList<>();
        Assertions.assertEquals(0,metod2(in));

    }
    @Test
    public void test12(){
        Integer [] intt = {1000,10303404,10202};
        ArrayList<Integer>in = new ArrayList<>(Arrays.asList(intt));
        Assertions.assertEquals(10314606,metod2(in));


    }
}

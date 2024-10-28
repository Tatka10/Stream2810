import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.example.Main.metod;

public class Testmetod {
    @Test
    public void test1 (){
        String [] mass = {"Palett", "Loshadka", "Korova"};
        Assertions.assertEquals(3,metod(mass));
    }
    @Test
    public void test2(){
        String [] mass = {};
        Assertions.assertEquals(0,metod(mass));
    }
    @Test
    public void test3(){
        String [] mass = {"Thre"};
        Assertions.assertEquals(0,metod(mass));
    }

}

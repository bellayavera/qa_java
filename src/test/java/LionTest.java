import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTest {

    Feline feline = new Feline();
    Lion lion = new Lion(feline, "Самец");

    public LionTest() throws Exception {
    }

    @Test
    public void getKittensTest(){
        Assert.assertEquals(1,lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void unknownSexTest(){
        Exception exception = Assert.assertThrows(Exception.class,() -> {Lion lion = new Lion(feline, "Некто");});
        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка",exception.getMessage());
    }
}

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionAlexTest {

    Feline feline = new Feline();
    LionAlex lionAlex = new LionAlex(feline,"Самец");

    public LionAlexTest() throws Exception {
    }

    @Test
    public void getFriendsTest(){
        Assert.assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"), lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest(){
        Assert.assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getKittensTest(){
        Assert.assertEquals(0,lionAlex.getKittens());
    }

}

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        int expected = 0;
        int actual = lionAlex.getKittens();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFriendsTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        List<String> expected = Arrays.asList("Марти", "Глория", "Мелман");;
        List<String> actual = lionAlex.getFriends();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expected = "Нью-Йоркский зоопарк";
        String actual = lionAlex.getPlaceOfLiving();

        Assert.assertEquals(expected, actual);
    }
}

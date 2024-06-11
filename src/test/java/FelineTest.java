import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Spy
    private Feline feline;

    @Test
    public void getEatMeatTest() throws Exception {
        List<String> returnList = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        Assert.assertEquals(returnList, actual);

    }

    @Test
    public void getFamilyTest() {
        String expected = "Кошачьи";
        Assert.assertEquals(expected, feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        int expected = 1;
        Assert.assertEquals(expected, feline.getKittens());
    }
}

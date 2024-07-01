import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);

        Mockito.when(feline.getKittens()).thenReturn(1);

        int actual = lion.getKittens();
        int expected = 1;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFoodTest() throws Exception{
        Lion lion = new Lion("Самец", feline);
        List<String> returnList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(returnList);

        List<String> actual = lion.getFood();
        List<String>  expected = returnList;

        Assert.assertEquals(expected,actual);
    }
}

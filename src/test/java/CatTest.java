import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Spy
    private Feline feline;

    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);

        List<String> returnList = Arrays.asList("Животные", "Птицы", "Рыба");

        List<String> actual = cat.getFood();
        List<String> expected = returnList;

        Assert.assertEquals(expected, actual);
    }
}

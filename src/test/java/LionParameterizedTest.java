import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String Sex;

    public LionParameterizedTest(String Sex) {
        this.Sex = Sex;
    }

    @Mock
    private Feline feline;

    @Parameterized.Parameters
    public static Object[] getSex() {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
                {"Man"}
        };
    }


    @Test
    public void getDoesHaveManeTest() throws Exception {
        try {
            Lion lion = new Lion(Sex, feline);
            if (Sex.equals("Самец")) {
                boolean actual = lion.doesHaveMane();
                boolean expected = true;

                Assert.assertEquals(expected, actual);
            } else if (Sex.equals("Самка")) {

                boolean actual = lion.doesHaveMane();
                boolean expected = false;
                Assert.assertEquals(expected, actual);
            }
        } catch (Exception exception) {
            System.out.println("Произошла ошибка!");
        }
    }

}

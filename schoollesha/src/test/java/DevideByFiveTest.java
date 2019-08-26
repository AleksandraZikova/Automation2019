import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DevideByFiveTest {
    int numberTrue = 15;
    int numberFalse = 15;
    static DevideByFive checker;

    @BeforeAll
    public static void init(){
        System.out.println("Checking if number divides by 5 by module");
        checker = new DevideByFive();
    }

    @Test
    public void devideByFiveTrue() {
        assertEquals(true, checker.isDevidedByFive(numberTrue));
    }

    @Test
    public void devideByFiveTrue2() {

        assertEquals(true, checker.isDevidedByFive(numberFalse));
    }

    @AfterAll
    public static void finish(){
        System.out.println("Testing is finished");
        checker = null;
    }


}

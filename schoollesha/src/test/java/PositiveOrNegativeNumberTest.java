import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveOrNegativeNumberTest {

    @Test
    public void checkNumberIsZero (){
        PositiveOrNegativeNumber positiveOrNegativeNumber = new PositiveOrNegativeNumber();
        assertEquals("The number is ZERO", positiveOrNegativeNumber.inputNumber(0));
    }

    @Test
    public void checkNumberIsPositive (){
        PositiveOrNegativeNumber positiveOrNegativeNumber = new PositiveOrNegativeNumber();
        assertEquals("The number is Positive", positiveOrNegativeNumber.inputNumber(5000));
    }

    @Test
    public void checkNumberIsNegative (){
        PositiveOrNegativeNumber positiveOrNegativeNumber = new PositiveOrNegativeNumber();
        assertEquals("The number is Negative", positiveOrNegativeNumber.inputNumber(-600));
    }

}
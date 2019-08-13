import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyFirstProgramTest {

    @Test
    @DisplayName("Two Positive Numbers")
    public void shouldReturnTwo() {
        assertEquals(2, new MyFirstProgram().substract(7, 5));
    }

    @Test
    @DisplayName("Two Negative Numbers ❤")
    public void checkNegativeNumbers() {
        assertEquals(-2, new MyFirstProgram().substract(-7, -5));
    }

    @Test
    @DisplayName("PositiveAndNegativeNumber :)")
    public void checkNegativeAndPositiveNumber() {
        assertEquals(-12, new MyFirstProgram().substract(-7, 5));
    }
}
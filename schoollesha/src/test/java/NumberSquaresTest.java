import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSquaresTest {

    @Test
    public void checkNumberSquare (){
        NumberSquares numberSquares = new NumberSquares();
        assertEquals(2, numberSquares.calculateSquare(5));
    }

    @Test
    public void checkNoFurther (){
        NumberSquares numberSquares = new NumberSquares();
        assertEquals(0, numberSquares.calculateSquare(0));
    }

    @Test
    public void checkNegative (){
        NumberSquares numberSquares = new NumberSquares();
        assertEquals(0, numberSquares.calculateSquare(-10));
    }


}
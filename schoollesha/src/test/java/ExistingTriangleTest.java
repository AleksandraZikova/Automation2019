import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExistingTriangleTest {
    @Test
    public void checkTriangle (){
        ExistingTriangle existingTriangle = new ExistingTriangle();
        assertEquals("YES", existingTriangle.isTriangle(10,40,48));
    }
    @Test
    public void checkTriangleNotExists (){
        ExistingTriangle existingTriangle = new ExistingTriangle();
        assertEquals("NO", existingTriangle.isTriangle(10,25,48));
    }

    @Test
    public void checkTriangleNotExists2 (){
        ExistingTriangle existingTriangle = new ExistingTriangle();
        assertEquals("NO", existingTriangle.isTriangle(10,35,20));
    }

    @Test
    public void checkTriangleNotExists3 (){
        ExistingTriangle existingTriangle = new ExistingTriangle();
        assertEquals("NO", existingTriangle.isTriangle(35,10,20));
    }

    @Test
    public void checkTriangleNotExistsZero (){
        ExistingTriangle existingTriangle = new ExistingTriangle();
        assertEquals("NO", existingTriangle.isTriangle(0,0,0));
    }

    @Test
    public void checkTriangleNotExistsNegative (){
        ExistingTriangle existingTriangle = new ExistingTriangle();
        assertEquals("NO", existingTriangle.isTriangle(5,10,-2));
    }

}
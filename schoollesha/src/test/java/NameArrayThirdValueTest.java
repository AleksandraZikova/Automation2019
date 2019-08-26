import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameArrayThirdValueTest {

    public class CheckThirdName {

        @BeforeAll
        public void init(){
            System.out.println("Vasja");
        }

        @Test
        public void isNameMine(){
            NameArrayThirdValue TT = new NameArrayThirdValue();
            String[] test = {"Marianna", "Vova", "Alexandra", "Yana"};

            assertEquals("Alexandra", TT.checkName(test), "Comment");
        }
    }
}

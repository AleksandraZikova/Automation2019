import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBirthdayTest {

    @Test
    public void isMyBD(){

        MyBirthday myBirthday = new MyBirthday();

        int month = 12;
        int day = 26;


        assertEquals("YES", myBirthday.isItMyBirthday(day, month));
    }

    @Test
    public void isNotMyBD(){

        MyBirthday myBirthday = new MyBirthday();

        assertEquals("NO", myBirthday.isItMyBirthday(12, 24));
    }

    @Test
    public void wasYesterday(){

        MyBirthday myBirthday = new MyBirthday();

        assertEquals("My Birthday was yesterday", myBirthday.isItMyBirthday(12, 27));
    }

    @Test
    public void isTomorrow(){

        MyBirthday myBirthday = new MyBirthday();

        assertEquals("My Birthday is tomorrow", myBirthday.isItMyBirthday(12, 25));
    }

    @Test
    public void invalidMonth(){

        MyBirthday myBirthday = new MyBirthday();

        assertEquals("Date is invalid", myBirthday.isItMyBirthday(25, 9));
    }

    @Test
    public void invalidDate(){

        MyBirthday myBirthday = new MyBirthday();

        assertEquals("Date is invalid", myBirthday.isItMyBirthday(05, 99));
    }


}
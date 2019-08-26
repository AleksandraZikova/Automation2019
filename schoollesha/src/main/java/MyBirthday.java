public class MyBirthday {

    public String isItMyBirthday(int month, int day) {
        if(month == 12 && day ==26) {
            return "YES";
        } else if(month == 12 && day==25) {
            return "My Birthday was yesterday";
        } else if (month == 12 && day==27){
            return "My Birthday is tomorrow";
        }
        else if (month > 12 & day > 31){
            return "Date is invalid";
        }

        else
            return "Not my Birthday";


    }

}

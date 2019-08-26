

public class PositiveOrNegativeNumber {

    public String inputNumber(int inputNumber) {
        if (inputNumber > 0) {
            return "The number is Positive";
        } else if (inputNumber < 0) {
            return "The number is Negative";
        } else if (inputNumber == 0) {
            return "The number is ZERO";
        } else return "Number does not exist";
    }
}

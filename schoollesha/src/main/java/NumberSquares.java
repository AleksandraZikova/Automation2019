public class NumberSquares {

    public int calculateSquare(int a) {
            int currentNumber = 1;
            while (currentNumber * currentNumber <= a) {
                System.out.println(currentNumber * currentNumber);
                currentNumber++;
            }
            return --currentNumber;
        }
}

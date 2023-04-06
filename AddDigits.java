public class AddDigits {
    public static int addDigits(int number) {
        var currentNumber = number;

        while (Integer.toString(currentNumber).length() > 1) {
            var currentSum = 0;

            while (currentNumber > 0) {
                currentSum += currentNumber % 10;
                currentNumber /= 10;
            }

            currentNumber = currentSum;
        }

        return currentNumber;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(0));
        System.out.println(addDigits(1));
        System.out.println(addDigits(9));
        System.out.println(addDigits(10));
        System.out.println(addDigits(38));
    }
}

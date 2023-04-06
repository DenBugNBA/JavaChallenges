public class FizzBuzz {
    public static void fizzBuzz(int begin, int end) {
        var currentNumber = begin;

        while (currentNumber <= end) {
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (currentNumber % 3 == 0) {
                System.out.println("Fizz");
            } else if (currentNumber % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(currentNumber);
            }

            currentNumber += 1;
        }
    }

    public static void main(String[] args) {
        fizzBuzz(11, 20);
    }
}

public class Power3 {
    public static Boolean isPowerOfThree(int number) {
        var i = 1;

        while (i <= number) {
            if (i == number) {
                return true;
            }

            i *= 3;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(1)); // true
        System.out.println(isPowerOfThree(3)); // true
        System.out.println(isPowerOfThree(4)); // false
        System.out.println(isPowerOfThree(9)); // true
    }
}
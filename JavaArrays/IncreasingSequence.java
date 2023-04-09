public class IncreasingSequence {
    public static boolean isIncreasingSequence(int[] array) {
        if (array.length < 2) {
            return false;
        }

        for (var i = 0; i < array.length - 1; i += 1) {
            if (array[i] + 1 != array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] numbers1 = { 10, 11, 12, 13 };
        System.out.println(isIncreasingSequence(numbers1)); // true

        int[] numbers2 = { -5, -4, -3 };
        System.out.println(isIncreasingSequence(numbers2)); // true

        int[] numbers3 = { 10, 11, 12, 14 };
        System.out.println(isIncreasingSequence(numbers3)); // false

        int[] numbers4 = { 1, 2, 2, 3 };
        System.out.println(isIncreasingSequence(numbers4)); // false

        int[] numbers5 = { 5 };
        System.out.println(isIncreasingSequence(numbers5)); // false

        int[] numbers6 = {};
        System.out.println(isIncreasingSequence(numbers6)); // false
    }
}
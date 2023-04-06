public class Fibonacci {
    public static int fib(int n) {
        var first = 0;
        var second = 1;

        for (var i = 0; i < n; i += 1) {
            var prevSecond = second;

            second = first + second;
            first = prevSecond;
        }

        return first;
    }

    public static void main(String[] args) {
        System.out.println(fib(0)); // 0
        System.out.println(fib(1)); // 1
        System.out.println(fib(2)); // 1
        System.out.println(fib(3)); // 2

        System.out.println(fib(5)); // 5

        System.out.println(fib(10)); // 55
    }
}

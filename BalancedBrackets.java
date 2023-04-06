public class BalancedBrackets {
    public static boolean isBalanced(String str) {
        var currentBalance = 0;

        for (var i = 0; i < str.length(); i += 1) {
            if (str.charAt(i) == '(') {
                currentBalance += 1;
            } else if (str.charAt(i) == ')') {
                currentBalance -= 1;
            }

            if (currentBalance < 0) {
                return false;
            }
        }

        return currentBalance == 0;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(())")); // true
        System.out.println(isBalanced("()()")); // true
        System.out.println(isBalanced("((())")); // false
    }
}

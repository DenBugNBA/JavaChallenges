public class LastWordLength {
    public static int getLastWordLength(String text) {
        var words = text.split(" ");

        var wordsLength = words.length;

        if (wordsLength == 0) {
            return 0;
        } else {
            return words[wordsLength - 1].length();
        }
    }

    public static void main(String[] args) {
        System.out.println(getLastWordLength("")); // 0
        System.out.println(getLastWordLength("man in BlacK")); // 5
        System.out.println(getLastWordLength("hello, world! ")); // 6
    }
}

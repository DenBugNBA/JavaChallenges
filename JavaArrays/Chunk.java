import java.util.Arrays;

public class Chunk {
    public static String[][] chunk(String[] words, int chunkSize) {
        var n = words.length;

        var nChunks = (int) Math.ceil((double) n / chunkSize);

        String[][] resultArray = new String[nChunks][chunkSize];

        var currentWordIndex = 0;

        for (var i = 0; i < nChunks; i += 1) {
            for (var j = 0; j < chunkSize; j += 1) {
                if (currentWordIndex == n) {
                    resultArray[i] = Arrays.copyOfRange(resultArray[i], 0, j);
                    return resultArray;
                }

                resultArray[i][j] = words[currentWordIndex];

                currentWordIndex += 1;
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        String[] words = { "one", "two", "three", "four" };

        var chunks1 = chunk(words, 2);
        System.out.println(Arrays.deepToString(chunks1));

        var chunks2 = chunk(words, 3);
        System.out.println(Arrays.deepToString(chunks2));
    }
}

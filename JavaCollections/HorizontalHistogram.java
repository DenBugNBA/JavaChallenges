import java.util.function.Supplier;
import java.util.stream.Stream;

public class HorizontalHistogram {
    public static void play(int rollsCount, Supplier<Integer> rollDice) {
        int[] rollResults = new int[6];
        Stream.generate(rollDice)
                .limit(rollsCount)
                .forEach((el) -> rollResults[el - 1]++);

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            builder.append(i + 1);
            builder.append("|");
            if (rollResults[i] > 0) {
                builder.append("#".repeat(rollResults[i]));
                builder.append(" ");
                builder.append(rollResults[i]);
            }

            builder.append("\n");
        }

        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        int[] rollResults = new int[6];
        System.out.println(rollResults[1]);
    }
}

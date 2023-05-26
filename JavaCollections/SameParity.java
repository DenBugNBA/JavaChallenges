import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SameParity {
    public static List<Integer> sameParityFilter(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return List.of();
        }

        return numbers.stream()
                .filter((num) -> Math.abs(numbers.get(0) % 2) == Math.abs(num % 2))
                .toList();
    }

    public static void main(String[] args) {
        List<Integer> coll1 = List.of(-1, 0, 1, -3, 10, -2);
        List<Integer> result1 = sameParityFilter(coll1);
        System.out.println(result1); // [-1, 1, -3]

        List<Integer> coll2 = List.of(2, 0, 1, -3, 10, -2);
        List<Integer> result2 = sameParityFilter(coll2);
        System.out.println(result2); // [2, 0, 10, -2]

        List<Integer> emptyColl = new ArrayList<>();
        List<Integer> result3 = sameParityFilter(emptyColl);
        System.out.println(result3); // []
    }
}

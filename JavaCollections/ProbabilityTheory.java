import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ProbabilityTheory {
    public static Map<Integer, Map<Integer, Double>> calculateProbabilities(List<Integer> diceTossingHistory) {
        Map<Integer, Map<Integer, Integer>> nextNumbersCount = new HashMap<>();

        for (int i = 0; i < diceTossingHistory.size() - 1; i++) {
            int currentNumber = diceTossingHistory.get(i);
            nextNumbersCount.putIfAbsent(currentNumber, new HashMap<>());

            int nextNumber = diceTossingHistory.get(i + 1);

            int prevCount = nextNumbersCount.get(currentNumber).getOrDefault(nextNumber, 0);
            nextNumbersCount.get(currentNumber).put(nextNumber, prevCount + 1);
        }

//        System.out.println(nextNumbersCount);

        Map<Integer, Map<Integer, Double>> nextNumbersProbability = new HashMap<>();

        for (Map.Entry<Integer, Map<Integer, Integer>> entry : nextNumbersCount.entrySet()) {
            nextNumbersProbability.put(entry.getKey(), new HashMap<>());

            int sumCount = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();

            for (Map.Entry<Integer, Integer> internalEntry : entry.getValue().entrySet()) {
                double currentProbability = (double) internalEntry.getValue() / sumCount;
                nextNumbersProbability.get(entry.getKey()).put(internalEntry.getKey(), currentProbability);
            }
        }

        if (diceTossingHistory.size() > 1) {
            int lastNumber = diceTossingHistory.get(diceTossingHistory.size() - 1);
            nextNumbersProbability.putIfAbsent(lastNumber, new HashMap<>());
        }

        return nextNumbersProbability;
    }

    public static void main(String[] args) {
        System.out.println(calculateProbabilities(
                List.of(1, 3, 1, 5, 1)
        ));

        System.out.println(calculateProbabilities(
                List.of(1, 3, 1, 5, 1, 2, 1, 6)
        ));
    }
}

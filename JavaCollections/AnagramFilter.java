import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFilter {
    public static List<String> filterAnagram(String sourceWord, List<String> words) {
        Map<Character, Integer> sourceWordLettersCount = countLetters(sourceWord);

        return words.stream()
                .filter((word) -> countLetters(word).equals(sourceWordLettersCount))
                .toList();
    }

    public static Map<Character, Integer> countLetters(String word) {
        Map<Character, Integer> sourceWordLettersCount = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
            int currentCount = sourceWordLettersCount.getOrDefault(currentLetter, 0);
            sourceWordLettersCount.put(currentLetter, currentCount + 1);
        }

        return sourceWordLettersCount;
    }

    public static void main(String[] args) {
        List<String> coll1 = List.of("aabb", "abcd", "bbaa", "dada");
        List<String> result1 = filterAnagram("abba", coll1);
        System.out.println(result1); // ["aabb", "bbaa"]

        List<String> coll2 = List.of("crazer", "carer", "racar", "caers", "racer");
        List<String> result2 = filterAnagram("racer", coll2);
        System.out.println(result2); // ["carer", "racer"]

        List<String> coll3 = List.of("lazing", "lazy", "lacer");
        List<String> result3 = filterAnagram("laser", coll3);
        System.out.println(result3); // []
    }
}

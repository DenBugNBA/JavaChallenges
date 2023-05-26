import java.util.ArrayList;
import java.util.List;

public class NearestNeighborSearch {
    public static int findIndexOfNearest(List<Integer> numbers, int target) {
        if (numbers.isEmpty()) {
            return -1;
        }

        int resultIndex = 0;
        int minDiff = Math.max(target, numbers.get(0)) - Math.min(target, numbers.get(0));

        for (int i = 1; i < numbers.size(); i++) {
            int currentDiff = Math.max(target, numbers.get(i)) - Math.min(target, numbers.get(i));

            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                resultIndex = i;
            }
        }

        return resultIndex;
     }

     public static void main(String[] args) {
        System.out.println(findIndexOfNearest(new ArrayList<Integer>(), 0));

         List<Integer> coll1 = List.of(15, 10, 3, 4);
         System.out.println(findIndexOfNearest(coll1, 0)); // 2

         List<Integer> coll2 = List.of(7, 5, 3, 2);
         System.out.println(findIndexOfNearest(coll2, 4)); // 1

         List<Integer> coll3 = List.of(7, 5, 4, 4, 3);
         System.out.println(findIndexOfNearest(coll3, 4)); // 2
     }
}

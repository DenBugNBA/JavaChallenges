import java.util.Arrays;

public class SnailPath {
    public static int[] buildSnailPath(int[][] array) {
        if (array.length == 0) {
            int[] emptyArray = {};
            return emptyArray;
        }

        int[] resultArray = new int[array.length * array[0].length];

        var index = 0;

        var top = 0;
        var bottom = array.length - 1;

        var left = 0;
        var right = array[0].length - 1;

        // 0 - слева направо; 1 - сверху вниз; 2 - справа налево; 3 - снизу вверх
        var direction = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (var i = left; i < right + 1; i += 1) {
                    resultArray[index] = array[top][i];
                    index += 1;
                }

                top += 1;
                direction = 1;

            } else if (direction == 1) {
                for (var i = top; i < bottom + 1; i += 1) {
                    resultArray[index] = array[i][right];
                    index += 1;
                }

                right -= 1;
                direction = 2;

            } else if (direction == 2) {
                for (var i = right; i > left - 1; i -= 1) {
                    resultArray[index] = array[bottom][i];
                    index += 1;
                }

                bottom -= 1;
                direction = 3;

            } else if (direction == 3) {
                for (var i = bottom; i > top - 1; i -= 1) {
                    resultArray[index] = array[i][left];
                    index += 1;
                }

                left += 1;
                direction = 0;
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        var result = buildSnailPath(matrix);
        System.out.println(Arrays.toString(result));

        int[][] emptyArray = {};
        System.out.println(Arrays.toString(buildSnailPath(emptyArray)));
    }
}

import java.util.Arrays;

public class MatrixMirroring {
    public static int[][] getMirroredMatrix(int[][] array) {
        var n = array.length;

        for (var i = 0; i < n; i += 1) {
            for (var j = 0; j < (n / 2); j += 1) {
                array[i][(n / 2) + j] = array[i][(n / 2) - 1 - j];
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 11, 12, 13, 14 },
                { 21, 22, 23, 24 },
                { 31, 32, 33, 34 },
                { 41, 42, 43, 44 },
        };

        var mirroredMatrix = getMirroredMatrix(matrix);

        System.out.println(Arrays.deepToString(mirroredMatrix));
    }
}
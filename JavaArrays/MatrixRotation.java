import java.util.Arrays;

public class MatrixRotation {
    public static int[][] rotateLeft(int[][] matrix) {
        var n = matrix[0].length;
        var m = matrix.length;

        int[][] rotatedMatrix = new int[n][m];

        for (var i = 0; i < m; i += 1) {
            for (var j = n - 1; j > -1; j -= 1) {
                rotatedMatrix[n - 1 - j][i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    public static int[][] rotateRight(int[][] matrix) {
        var n = matrix[0].length;
        var m = matrix.length;

        int[][] rotatedMatrix = new int[n][m];

        for (var i = 0; i < m; i += 1) {
            for (var j = 0; j < n; j += 1) {
                rotatedMatrix[j][m - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 0, 1, 2 },
        };

        var rotatedLeft = rotateLeft(matrix);
        System.out.println(Arrays.deepToString(rotatedLeft));

        var rotatedRight = rotateRight(matrix);
        System.out.println(Arrays.deepToString(rotatedRight));
    }
}

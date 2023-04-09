import java.util.Arrays;

public class MatrixMultiplication {
    /**
     * Строка на столбец
     *
     * Две матрицы можно перемножать только в том случае, если количество столбцов в
     * первой матрице совпадает с количеством строк во второй матрице.
     * 
     * В результате операции умножения матрицы размера M×N на матрицу размером N×K
     * является матрица размером M×K.
     */
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        var n = matrix1.length;
        var m = matrix2[0].length;

        int[][] resultMatrix = new int[n][m];

        for (var i = 0; i < n; i += 1) {
            for (var j = 0; j < m; j += 1) {
                for (var k = 0; k < matrix1[0].length; k += 1) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        int[][] matrixA = {
                { 2, 5 },
                { 6, 7 },
                { 1, 8 },
        };

        int[][] matrixB = {
                { 1, 2, 1 },
                { 0, 1, 0 },
        };

        var multipliedMatrix = multiply(matrixA, matrixB);
        System.out.println(Arrays.deepToString(multipliedMatrix));
    }
}
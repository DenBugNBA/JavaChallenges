public class SeaBattle {
    public static boolean isValidField(int[][] field) {
        var n = field.length;

        int[][] fieldWithBorders = new int[n + 2][n + 2];

        for (var i = 1; i < (n + 1); i += 1) {
            for (var j = 1; j < (n + 1); j += 1) {
                fieldWithBorders[i][j] = field[i - 1][j - 1];
            }
        }

        int[] diNotValid = { -1, -1, 1, 1 };
        int[] djNotValid = { -1, 1, -1, 1 };

        for (var i = 1; i < (n + 1); i += 1) {
            for (var j = 1; j < (n + 1); j += 1) {
                if (fieldWithBorders[i][j] == 1) {
                    for (var di : diNotValid) {
                        for (var dj : djNotValid) {
                            if (fieldWithBorders[i + di][j + dj] == 1) {
                                return false;
                            }
                        }
                    }

                    if ((fieldWithBorders[i][j - 1] == 1 || fieldWithBorders[i][j + 1] == 1)
                            && (fieldWithBorders[i - 1][j] == 1 || fieldWithBorders[i + 1][j] == 1)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static int calcShipsCount(int[][] field) {
        var n = field.length;

        int[][] fieldWithPointers = new int[n][n];

        for (var i = 0; i < n; i += 1) {
            for (var j = 0; j < n; j += 1) {
                fieldWithPointers[i][j] = field[i][j];
            }
        }

        var shipsCount = 0;

        for (var i = 0; i < n; i += 1) {
            for (var j = 0; j < n; j += 1) {
                if (fieldWithPointers[i][j] == 1) {
                    shipsCount += 1;

                    fieldWithPointers[i][j] = 0;

                    var checkJ = j + 1;
                    while (checkJ < n && fieldWithPointers[i][checkJ] == 1) {
                        fieldWithPointers[i][checkJ] = 0;
                        checkJ += 1;
                    }

                    var checkI = i + 1;
                    while (checkI < n && fieldWithPointers[checkI][j] == 1) {
                        fieldWithPointers[checkI][j] = 0;
                        checkI += 1;
                    }
                }
            }
        }

        return shipsCount;
    }

    public static void main(String[] args) {
        int[][] battleField1 = {
                { 1, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0, 1 },
                { 0, 0, 0, 0, 0, 1 },
                { 1, 1, 0, 1, 0, 0 },
        };

        int[][] battleField2 = {
                { 0, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 0, 0, 0 },
                { 0, 1, 1, 1 },
        };

        System.out.println(isValidField(battleField1)); // true
        System.out.println(isValidField(battleField2)); // false

        System.out.println(calcShipsCount(battleField1)); // 6
    }
}

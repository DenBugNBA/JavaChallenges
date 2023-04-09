import java.util.Arrays;

public class PascalsTriangle {
    // Треугольник Паскаля — бесконечная таблица биномиальных коэффициентов, имеющая
    // треугольную форму. В этом треугольнике на вершине и по бокам стоят единицы.
    // Каждое число равно сумме двух расположенных над ним чисел. Строки
    // треугольника симметричны относительно вертикальной оси.
    public static int[] generate(int line) {
        int[] prevLine = { 1 };

        for (int i = 1; i < line + 1; i += 1) {
            int[] currentLine = new int[i + 1];
            currentLine[0] = 1;
            currentLine[i] = 1;
            for (var j = 1; j < i; j += 1) {
                currentLine[j] = prevLine[j - 1] + prevLine[j];
            }

            prevLine = currentLine;
        }

        return prevLine;
    }

    public static void main(String[] args) {
        var result = generate(4);
        System.out.println(Arrays.toString(result));
    }
}

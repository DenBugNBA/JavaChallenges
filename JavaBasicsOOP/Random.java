public class Random {
    /**
     * X(n + 1) = (a * Xn + c) mod m
     *
     * m - модуль (натуральное число, относительно которого вычисляет остаток от
     * деления), m >= 2
     *
     * a - множитель 0 <= a < m
     *
     * c - приращение 0 <= c < m
     *
     * X0 - начальное значение 0 <= X0 < m
     *
     */

    private int seedX;
    private int currentX;

    private int a;
    private int c;
    private int m;

    Random(int seed) {
        this.seedX = seed;
        this.currentX = seed;

        this.a = seed;
        this.c = seed;
        this.m = seed + 3;
    }

    public int getNext() {
        this.currentX = ((this.a * this.currentX + this.c) % this.m);
        return this.currentX;
    }

    public void reset() {
        this.currentX = this.seedX;
    }

}

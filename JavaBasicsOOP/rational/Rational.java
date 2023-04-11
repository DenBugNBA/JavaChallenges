package rational;

public class Rational {
    /**
     * Рациональным называют число, которое может быть представлено в виде дроби
     * a/b, где a — это числитель дроби, b — знаменатель дроби.
     */
    private int numerator;
    private int denominator;

    Rational(int numerator, int denominator) {
        if (numerator < 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        } else if (numerator < 0 || denominator < 0) {
            numerator = -Math.abs(numerator);
            denominator = Math.abs(denominator);
        }

        // System.out.println(numerator);
        // System.out.println(denominator);

        var currentGcd = Utils.gcd(numerator, denominator);

        // System.out.println(currentGcd);
        // System.out.println();

        this.numerator = numerator / currentGcd;
        this.denominator = denominator / currentGcd;
    }

    public int getNumer() {
        return this.numerator;
    }

    public int getDenom() {
        return this.denominator;
    }

    public String toString() {
        return String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator);
    }

    public Rational add(Rational number2) {
        var sumDenominator = this.denominator * number2.denominator;
        var sumNumerator = (this.numerator * number2.denominator) + (number2.numerator * this.denominator);

        return new Rational(sumNumerator, sumDenominator);
    }

    public Rational sub(Rational number2) {
        var subtractionDenominator = this.denominator * number2.denominator;
        // System.out.println(sumDenominator);
        var subtractionNumerator = (this.numerator * number2.denominator) - (number2.numerator * this.denominator);
        // System.out.println(sumNumerator);

        return new Rational(subtractionNumerator, subtractionDenominator);
    }

    public static void main(String[] args) {
        var rat1 = new Rational(3, 9);

        System.out.println(rat1.getNumer()); // 1
        System.out.println(rat1.getDenom()); // 3
        System.out.println(rat1.toString()); // "1/3"

        var rat2 = new Rational(10, 3);
        var sum = rat1.add(rat2);
        System.out.println(sum.toString()); // "11/3"

        var sub = rat1.sub(rat2);
        System.out.println(sub.toString()); // "-3/1"

        var rat3 = new Rational(-10, -3);
        System.out.println(rat3.toString());
    }
}

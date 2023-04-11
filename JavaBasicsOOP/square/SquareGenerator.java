package square;

import java.util.Arrays;

class SquareGenerator {
    public static Square[] generate(double side, int numberOfInstances) {
        Square[] arrayOfSquares = new Square[numberOfInstances];

        for (var i = 0; i < numberOfInstances; i += 1) {
            arrayOfSquares[i] = new Square(side);
        }

        return arrayOfSquares;
    }

    public static void main(String[] args) {
        Square[] squares = SquareGenerator.generate(5, 3);
        System.out.println(Arrays.toString(squares));
    }
}

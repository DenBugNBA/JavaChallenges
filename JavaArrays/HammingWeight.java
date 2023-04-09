public class HammingWeight {
    // Вес Хэмминга — это количество единиц в двоичном представлении числа.
    public static int getHammingWeight(int number) {
        var binaryString = Integer.toBinaryString(number);

        var binaryStringWithoutZeroes = binaryString.replace("0", "");

        return binaryStringWithoutZeroes.length();
    }

    public static void main(String[] args) {
        System.out.println(getHammingWeight(0)); // 0
        System.out.println(getHammingWeight(4)); // 1
        System.out.println(getHammingWeight(101)); // 4
    }
}

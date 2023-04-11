package rational;

public class Utils {
    public static int gcd(int a, int b) {
        // наибольший общий делитель (НОД) - Greatest common divisor
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}

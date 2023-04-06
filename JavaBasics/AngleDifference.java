public class AngleDifference {
    public static int diff(int angle1, int angle2) {
        var difference1 = Math.abs(angle1 - angle2);
        var difference2 = 360 - difference1;

        return Math.min(difference1, difference2);
    }

    public static void main(String[] args) {
        System.out.println(diff(0, 45)); // 45
        System.out.println(diff(0, 180)); // 180
        System.out.println(diff(0, 190)); // 170
        System.out.println(diff(120, 280)); // 160
    }
}

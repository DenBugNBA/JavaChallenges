public class Circle {
    private int radius;

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
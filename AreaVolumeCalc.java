public class AreaVolumeCalc {
    private final double PI = 3.1415;

    public float area(float sideA) {
        return sideA * sideA;
    }

    public float area(float sideA, float sideB) {
        return sideA * sideB;
    }

    public double area(double radius) {
        return radius * radius * PI;
    }

    public float volume(float sideA) {
        return area(sideA) * sideA;
    }

    public float volume(float sideA, float sideB, float height) {
        return area(sideA, sideB) * height;
    }

    public double volume(double radius) {
        return (4 * PI * (radius * radius * radius)) / 3;
    }

    public double volume(double radius, double height) {
        return area(radius) * height;
    }
}
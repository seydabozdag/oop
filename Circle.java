public class Circle {
    private static final double PI = 3.141519;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);

        Circle[] circles = {circle1, circle2, circle3};

        for (Circle circle : circles) {
            double area = circle.computeArea();
            System.out.println("Circle with radius " + circle.radius + " has area: " + area);
        }
    }
}

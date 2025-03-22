
class Shape {
    
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0; 
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public final double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class JavaAssignment3 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        
        // Method overloading demonstration
        System.out.println("Circle Area: " + shape.calculateArea(5)); // Circle
        System.out.println("Rectangle Area: " + shape.calculateArea(4, 6)); // Rectangle
        System.out.println("Triangle Area: " + shape.calculateArea(4, 5, true)); // Triangle

        // Overriding demonstration
        Circle circle = new Circle(7);
        System.out.println("Overridden Circle Area: " + circle.calculateArea(7));

       
    }
}

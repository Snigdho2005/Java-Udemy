class Vehicle {
    protected String brand;
    protected int speed;


    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    
    public Car(String brand, int speed) {
        super(brand, speed);
    }


    public final void maxSpeed() {
        System.out.println("Max speed of this car is: " + speed + " km/h");
    }
}


public class JavaAssignment2 {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 180);
        myCar.display();  // Calls Vehicle's method
        myCar.maxSpeed(); // Calls Car's final method
    }
}

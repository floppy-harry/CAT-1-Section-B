import java.util.Scanner;

// Base Class
class Vehicle {
    
    // Fields
    protected String brand;
    protected String model;
    protected int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass
class Car extends Vehicle {
    
    // Additional field
    private String fuelType;

    // Constructor (calls parent constructor using super)
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();  // Call parent method
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main Class
public class Showroom {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter Brand: ");
        String brand = input.nextLine();

        System.out.print("Enter Model: ");
        String model = input.nextLine();

        System.out.print("Enter Year: ");
        int year = input.nextInt();
        input.nextLine(); // Clear buffer

        System.out.print("Enter Fuel Type: ");
        String fuelType = input.nextLine();

        // Create Car object
        Car car = new Car(brand, model, year, fuelType);

        // Display details
        System.out.println("\nCar Details:");
        car.displayDetails();

        input.close();
    }
}

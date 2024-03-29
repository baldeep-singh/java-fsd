package PracticeProject2;
//Class definition
class Car {
 // Attributes
 String brand;
 String model;
 int year;

 // Constructor
 public Car(String brand, String model, int year) {
     this.brand = brand;
     this.model = model;
     this.year = year;
 }

 // Method
 public void displayDetails() {
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
 }
}

public class Problem8 {
 public static void main(String[] args) {
     // Creating objects
     Car car1 = new Car("Toyota", "Corolla", 2020);
     Car car2 = new Car("Honda", "Civic", 2019);

     // Accessing attributes and methods
     car1.displayDetails();
     car2.displayDetails();
 }
}

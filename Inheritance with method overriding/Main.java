 class Vehicle{
    //base/parent class
    String brand;
    int year;
    //Constructor of the base class
    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
        
    }
    //Methods of in the base class
    void start(){
        System.out.println("Vehicle is starting");
    }
    void displayDetail(){
        System.out.println("Brand " + brand + " year " + year);
    }
}
//Derive Class inheriting from the base class
class Car extends Vehicle{
int numberOfDoors;
    Car(String brand, int year, int numberOfDoors){
        super(brand,year);
        this.numberOfDoors = numberOfDoors;
    }
    void drive(){
        System.out.println("Car is driving");
    }
    //Overridding Method to display car details
    void displayDetail(){
        super.displayDetail();
        System.out.println(numberOfDoors);
    }
}
class Bike extends Vehicle{
    boolean hasSeat;
        Bike(String brand, int year, boolean hasSeat){
            super(brand,year);
            this.hasSeat = hasSeat;
        }
        void ride(){
            System.out.println("Bike is moving");
        }
        void displayDetail(){
            super.displayDetail();
            System.out.println(hasSeat);
        }
    }

public class Main{
    public static void main(String[] args){
        Car obj = new Car("abc", 123, 4);
        obj.displayDetail();
        Bike obj1 = new Bike("Trek", 2020, true);
        obj1.ride();
        obj1.displayDetail();
        obj1.start();
    }
} 
    


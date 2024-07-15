abstract class Vehicle{
    public abstract void move();
}

class Car extends Vehicle{
    public void move(){
        System.out.println("The car drives away");
    }
}

class Motorcycle extends Vehicle{
    public void move(){
        System.out.println("The motorcycle drives away");
    }
}

public class Project{
    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        car.move();
        motorcycle.move();
    }
}
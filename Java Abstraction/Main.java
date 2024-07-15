abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("It is hot");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("It is cold");
    }
}

public class Main{
    public static void main(String[] args){
        Animal mydog = new Dog();
        Animal mycat = new Cat();
        mydog.makeSound();
        mycat.makeSound();
    }
}
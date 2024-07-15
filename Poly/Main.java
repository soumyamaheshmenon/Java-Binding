class Animal {
    void makeSound (){
        System.out.println("Some sound");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Woof");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow");
    }
}

class Bird extends Animal{
    void makeSound(){
        System.out.println("Chirp");
    }
}

public class Main{
    public static void main(String[] args){
        Animal obj = new Dog();
        Animal obj1 = new Cat();
        Animal obj2 = new Bird();
        obj.makeSound();
        obj1.makeSound();
        obj2.makeSound();
    }
}
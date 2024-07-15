class Animal{
    // Method with one parameter
    void sound(String sound){
        System.out.println("Animal makes sound" + sound);
    }
    // Overloaded method with two parameters
    void sound(String sound, int x){
        System.out.println("Animal makes sound " + sound + " With volume " + x);
    }
}

class Dog extends Animal{
    void walk(){
        System.out.println("Animal is running");
    }
}

public class Main{
    public static void main(String[] args){
        Dog abc = new Dog();
        abc.sound(" woof");
        abc.sound(" woof", 5);
    }
}
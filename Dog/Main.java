class Animal{
    void eat (){
        System.out.println("This animal eats food");
        // Super-class / Parent class
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks");
        //Sub/Child-class
    }
}
public class Main{
    public static void main(String[] args){
        Dog ball = new Dog();
        ball.bark();
        ball.eat();
    
    }
}
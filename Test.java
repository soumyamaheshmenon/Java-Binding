class Animal{
    Animal(){
        System.out.println("The sky is blue");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("The dog is brown");
    }
}

class Test{
    public static void main(String[] args){
        Dog obj = new Dog();
    }
}
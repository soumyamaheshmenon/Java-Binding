class Animal{

    void num (){
       System.out.println("abc"); 
    }
}

//When type of the object is determined at runtime, it is known as dynamic binding


class File2 extends Animal{

    void num(){
        System.out.println("123");
    }
    public static void main(String[] args){
        Animal obj = new File2();
        obj.num();
    }
}
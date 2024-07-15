final class File3 {//Final class
    
}

class Bike extends File3 {
    void run(){
        System.out.println("abc");
    }
    public static void main(String[] args){
        Bike obj = new Bike();
        obj.run(); 
    }
}
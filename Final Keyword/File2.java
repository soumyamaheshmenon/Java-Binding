
class File2 {
    final void run(){//Final Method/Function
        System.out.println("Running");
    }

}

class Bike extends File2 {
    
    void run(){
        System.out.println("Pedaling");
    }
    public static void main (String[] args){
            Bike obj = new Bike();
            obj.run();
    }
 }
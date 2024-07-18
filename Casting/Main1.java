class A{
    public void show1(){
        System.out.println("Show A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("Show B");
    }
}

class Main1{
    public static void main(String[] args) {
        
      A obj =  new B();//upcasting
      obj.show1();

      B obj1 = (B) obj;//downcasting
      obj1.show2();
    }
}
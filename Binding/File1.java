//static Binding example
//if there is any private, final or static method in a class, there is static binding
class File1{

    private void num(){
        System.out.println("abc");
    }
    public static void main(String[] args){
        File1 obj = new File1();
        obj.num();
    }
}
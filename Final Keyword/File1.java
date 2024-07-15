class File1 {
    
    final int speedlimit = 90;//Final Variable
    void run(){
        speedlimit = 400;
    }

    public static void main(String[] args){
        File1 obj = new File1();
        obj.run();

    }
}
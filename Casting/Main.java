//type casting


class Main{
    public static void main(String[] args) {
        
        double d = 5.6;
        //int i = d; this will not work. Type mismatch.
        int i = (int) d;

        System.out.println(i);
    }
}


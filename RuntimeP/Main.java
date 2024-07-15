class Shape {
    
    void draw(){
        System.out.println("Drawing");
    }
}

class Circle extends Shape{

    void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Triangle extends Shape{

    void draw(){
        System.out.println("Drawing a triangle");
    }
}

class Main{
    public static void main(String[] args){
        Shape s;
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}
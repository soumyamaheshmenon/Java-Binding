class Student{
     int count = 0;
    Student(){
        count = count + 1;
        System.out.println(count);
    }
}

public class Project2{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
    }
}
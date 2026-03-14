package JAVA_OOPS;

class student {
    int id;
    String n;
    public student(int id, String n){
        this.id = id;
        this.n = n;
    }
}
public class Mains{
    public static void main(String[] args) {
        student s1 = new student(10, "Alice");
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}
   
    

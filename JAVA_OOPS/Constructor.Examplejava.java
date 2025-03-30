package JAVA_OOPS;

class Test1{
    public Test1(){
        System.out.println("Constructor called");
    }
    public void PrintHello(){
        System.out.println("Hello, World!");
    }

}
class ConstructorExample {
    public static void main(String[] args) {
        Test1 test=new Test1();
        test.PrintHello();
    }
    
}

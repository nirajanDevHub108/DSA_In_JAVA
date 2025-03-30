package JAVA_OOPS;
 class test{
    public  int sum(int a, int b){
        return a+b;
    }
 }
 class sum {
    public static void main(String[] args) {
        test test1= new test();
        System.out.println(test1.sum(5, 6));
    }
    
}

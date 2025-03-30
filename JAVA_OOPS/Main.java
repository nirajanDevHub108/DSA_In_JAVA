package JAVA_OOPS;

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne=new Cookie("Red");
        cookieOne.setColor("yellow");
        System.out.println(cookieOne.getColor());
        Cookie cookieTwo=new Cookie("Blue");
        cookieTwo.setColor("black");
        System.out.println(cookieTwo.getColor());

        
    }
}

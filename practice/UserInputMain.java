package practice;

import java.util.Scanner;

public class UserInputMain {
    public static void main(String[] args) {
        
        // String firstStr = sc.nextLine();
        // System.out.println("you have entered: " + firstStr);

        // int a = sc.nextInt();
        // System.out.println("entered number :" +a);

        System.out.println("hello = whats your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello -" + name);

        System.out.println("what is your age ?");
        int age = sc.nextInt();
        System.out.println("you are " + age + " years old");
    }
    
}

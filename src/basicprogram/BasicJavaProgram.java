package basicprogram;

import java.util.Scanner;


public class BasicJavaProgram {
    public static void main(String[] args) {
      //  int a=28,b=58,c;
        int d;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Value of a");
        int a = scanner.nextInt();

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter the Value of b");
        int b = scanner1.nextInt();

        Scanner scanner2=new Scanner(System.in);
        System.out.println("Enter the Value of c");
        int c = scanner2.nextInt();


        d=a+b+c;
        System.out.println("the value of d is"+d);
    }
}

package basicprogram;

import java.util.Scanner;

public class ScannerClassInput {
    public static void main(String[] args) {

        int c;
        System.out.println("enter value a");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter b");
        Scanner cs=new Scanner(System.in);
        int b = cs.nextInt();
        c=a+b;
        System.out.println("value of c " +c);
    }
}

package basicprogram;

import java.util.Scanner;

public class EvenOdd2 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter the value of a");
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        if (i%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }
        System.out.println(i);
    }
}

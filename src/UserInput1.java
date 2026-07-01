import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age = scr.nextInt();
        if( age <18){
            System.out.println(" Not eligible");
        }else
        {
            System.out.println("Eligible for voting");
        }
    }
}

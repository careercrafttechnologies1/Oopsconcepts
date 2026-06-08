package basicprogram;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int reverse = 0;

        for(int i=0; i<4; i++) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10; }
        System.out.println("Reverse = "+ reverse);
        }
    }


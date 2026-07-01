package java8;

public class PositiveNegativeTest {
    public static void main(String[] args) {
        PositiveNegative positiveNegative = (n) -> {
            if(n>0){
                System.out.println("Number is Positive");
            }else if(n<0){
                System.out.println("Number is Negative");
            }else {
                System.out.println("zero");
            }
        };
        positiveNegative.check(0);
    }
}

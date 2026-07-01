package java8;

public class OddEvenTest {
    public static void main(String[] args) {
        OddEven oddEven = (n)->{
            if(n%2==0){
            System.out.println("Number is even");
        }else {
                System.out.println("Number is not even");
            }};
        oddEven.check(7);
    }
}

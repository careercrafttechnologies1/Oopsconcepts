package java8;

public class MinTest {
    public static void main(String[] args) {
        Min min = (int a, int b) -> {
            if (a<b){
                System.out.println(a);
            }else {
                System.out.println(b);
            }
        };
        min.min(5,4);
    }
}

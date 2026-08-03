package java8;

public class TestCheckMax {
    public static void main(String[] args) {
        MyInterface max = (int a, int b, int c)->{
            if(a>b && a>c){
                System.out.println("a is greater");
            } else if (b>a&& b>c) {
                System.out.println("b is grater");
            }else {
                System.out.println("c is greater");
            }
        };
        max.checkMax(7,5,3);
    }
}

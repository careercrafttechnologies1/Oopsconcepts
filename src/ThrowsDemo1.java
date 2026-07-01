public class ThrowsDemo1 {
    static void check () throws ArithmeticException, NullPointerException, IndexOutOfBoundsException {

            int a = 10;
            int b = 0;
            int c = a / b;}
            public static void main(String[]args){
            try{
                check();

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }
    }}



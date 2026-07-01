public class ThrowDemo1 {
    public static void main(String[] args) {
        int age = 88;
        if (age < 18) {
            throw new ArithmeticException("not eligible for driving");
        }
        {
            System.out.println("eligible");
        }
//        try {
//            age=12;
//
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }
    }
}

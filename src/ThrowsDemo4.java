public class ThrowsDemo4 {
    static void checkResult(int result) throws ArithmeticException{
        if(result<33){
            throw new ArithmeticException("Student fail :(");
        }
        {
            System.out.println("Student pass :)");
        }
    }

    public static void main(String[] args) {
        try {
            checkResult(32);
        } catch (ArithmeticException e) {
            e.printStackTrace();

        }
    }
}

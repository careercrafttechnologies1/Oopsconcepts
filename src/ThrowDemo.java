public class ThrowDemo {
    public static void main(String[] args) {
        int age=19;
        if(age<18){
            throw new ArithmeticException("Not eligible for voting :(");
        }
        else {
            System.out.println("Eligible for vote :)");
        }
    }
}

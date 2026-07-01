public class ThrowsDemo7 {
    static void batteryPercentage(int Percentage) throws ArithmeticException{
        if(Percentage< 20) {
            throw new ArithmeticException("battery dead");
        }
        System.out.println("Battery charged");
    }

    public static void main(String[] args) {
        try{
            batteryPercentage(10);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
    }
}

public class ThrowsDemo {
    static void withdrawAmount(double withdrawAmount, double balance) throws ArithmeticException {
        if (withdrawAmount > balance) {
            throw new ArithmeticException(" Insufficient Balance :( ");
        } else {
            System.out.println("Withdrawal Successful :)");
        }

    }
        public static void main(String []args){
            withdrawAmount(1000,5000);

    }
}

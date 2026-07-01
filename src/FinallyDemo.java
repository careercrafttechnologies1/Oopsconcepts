public class FinallyDemo {
        public static void main(String[] args) {
            try {
                int result = 10 / 0;
            }
            catch (ArithmeticException e) {
                System.out.println("Exception Handled");
                // * Finally
            } finally {
                System.out.println("Finally Block Executed :)");
            }

            System.out.println("Program End :)");
        }
    }



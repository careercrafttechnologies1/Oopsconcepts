public class FinallyDemo1 {
        public static void main(String[] args) {

            try {
                System.out.println("Inside Try");
            }
            // Catch not execute.
            catch (Exception e) {
                System.out.println("Exception Handled");
            }         finally {
                System.out.println("Finally Block Executed");
            }

            System.out.println("Program End");
        }
    }



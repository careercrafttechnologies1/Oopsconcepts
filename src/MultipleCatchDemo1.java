public class MultipleCatchDemo1 {

        public static void main(String[] args) {

            try {

                String str = null;

                System.out.println(str.length());

                int result = 10 / 0;
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception");
            }          catch (NullPointerException e) {
                System.out.println("Null Pointer Exception");
            }
            System.out.println("Program End :)");
        }
    }


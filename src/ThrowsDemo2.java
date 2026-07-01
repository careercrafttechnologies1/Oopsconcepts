public class ThrowsDemo2 {
    static void validAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("not valid age for voting");
        } else {
            System.out.println("valid age for voting");
        }
    }
        public static void main (String [] args){
        try {
            validAge(15);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }

        }
    }


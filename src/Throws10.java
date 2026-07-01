public class Throws10 {
    static void CheckAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("non adult");
        }
        {
            System.out.println("adult");
        }
    }
        public static void main(String[] args) {
            try
        {
            CheckAge(5);
        }
        catch (ArithmeticException s)
        {
            s.printStackTrace();
        }
    }}


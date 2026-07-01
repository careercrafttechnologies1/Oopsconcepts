public class FinallyDemo2{

    // Try + Finally without(Catch)
    public static void main(String[] args) {

        try {
            System.out.println("Inside Try");
        }         finally {
            System.out.println("Finally Block");
        }

        System.out.println("Program end:)");
    }

}

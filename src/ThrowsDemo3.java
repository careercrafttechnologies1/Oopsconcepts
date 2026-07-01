public class ThrowsDemo3 {

    //Method-to-Method Exception Propagation:)

    static void method1()throws Exception {
        throw new Exception("something went wrong :)");
    }
    static void method2()throws Exception{
        method1();
    }

    public static void main(String[] args) {
        try{
            method2();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

}

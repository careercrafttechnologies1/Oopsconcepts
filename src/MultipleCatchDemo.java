public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int [] arr = {10,20,23};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException s){
            System.out.println("Array Index Exception Handled");
        }catch (ArithmeticException s){
            System.out.println("Arithmetic Exception");
        }
        System.out.println("Program End");
    }
}

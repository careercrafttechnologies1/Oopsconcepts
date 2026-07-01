import arrays.Array;

public class Test2 {
    public static void main(String[] args) {
        try {
            int[]arr={1,2,5};
            System.out.println(arr[30]);

        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }
    }
}

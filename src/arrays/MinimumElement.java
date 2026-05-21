package arrays;

public class MinimumElement {
    public static void main(String[] args) {
        int [] arr= {21,23,2,4,1,5,34,34,56};
        int min= arr[0];
        for(int i =0; i<arr.length; i++) {
            if (arr[i] < min) {
                 min = arr[i];
            }
        }
            System.out.println("minimum = "+ min);


    }
}


//public class MinimumElement {
//    public static void main(String[] args) {
//
//        int[] arr = {21,23,2,4,2,5,34,34,56};
//
//        int min = arr[0];
//
//        for(int i = 1; i < arr.length; i++) {
//
//            if(arr[i] < min) {
//                min = arr[i];
//            }
//        }
//
//        System.out.println("Minimum = " + min);
//    }
//}
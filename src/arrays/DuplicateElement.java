package arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int [] arr = {21,21,21,34,32,34,4,5,45,56,56,76,78,78,79};

        for(int i =0; i< arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;

                }
            }
        }

    }
}

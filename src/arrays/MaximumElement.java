package arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int [] arr= {21,23,34,45,56,67,78,98,76,92,211,100,212,223,234,250};
        int max=0;
        for(int i=0; i<arr.length;i++)
        {
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println("max = "+ max);
    }
}

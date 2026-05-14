package arrays;

public class SunOfArrayAndAverage {
    public static void main(String[] args) {
        int [] arr = {21,23,34,45,56,67,78,89};
        int sum=0, avg=0;

        for(int i=0; i<arr.length;i++)

            sum=sum+arr[i];
        avg= sum/arr.length;


        {
            System.out.println("sum" + sum);
            System.out.println("avg"+ avg);
        }
    }
}

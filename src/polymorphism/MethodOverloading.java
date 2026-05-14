package polymorphism;

public class MethodOverloading {

    public int sum(int a,int b)
    {
        return a+b;
    }

    public int sum(int a,int b, int c)
    {
        return a+b+c;
    }
    public double sum(double b,int a, int c)
    {
        return a+b+c;
    }
    public double sum(double a,double b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading =new MethodOverloading();
        //double sum = methodOverloading.sum(25.5, 50.5);
      //  System.out.println(sum);
        System.out.println( methodOverloading.sum(35.5, 50.5));

//        methodOverloading.sum(34,23,10);
//        methodOverloading.sum(34.5,35.5);

    }

}

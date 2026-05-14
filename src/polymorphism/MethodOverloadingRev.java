package polymorphism;

public class MethodOverloadingRev {
    public int subtraction(int a, int b){
        return a-b;

    }
    public int subtraction(int a, int b, int c){
        return a-b-c;
    }
    public double subtraction(double a, double b){
        return a-b;
    }
    public double subtraction(double a, int b, int c){
        return a-b-c;
    }

    public static void main(String[] args) {
//        MethodOverloading methodOverloading = MethodOverloading();
        MethodOverloadingRev methodOverloadingRev = new MethodOverloadingRev();
        System.out.println(methodOverloadingRev.subtraction(23.5,21.3));
        }
    }


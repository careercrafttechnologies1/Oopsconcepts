package polymorphism;

public class MethodOverloadindDemo {
    public void show(int a){
        System.out.println("int a");
    }
    public void show(double a){
        System.out.println("double a");
    }
    void show(double a, double b){
        System.out.println("double a, double b");

    }
    void show(int a, int b){
        System.out.println("int a, int b");
    }
    void show(String s){
        System.out.println("String s");
    }

    //Show show = new Show();
    public static void main(String[] args) {


        MethodOverloadindDemo obj = new MethodOverloadindDemo();

//    public void setMethodOverloadindDemo(MethodOverloadindDemo methodOverloadindDemo) {
//        this.methodOverloadindDemo = methodOverloadindDemo;
//    }
        obj.show(10);
        obj.show(10.5);
        obj.show(10, 20);
        obj.show(10.5, 20.5);
        obj.show("Hello");
        //public static void main(String[] args) {
    }
    }

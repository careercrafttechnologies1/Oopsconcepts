package polymorphism;

public class MethodOve1 {
    public void show(String name,int age)
    {
        System.out.println(name+age);
    }

    public void show(int age,String name)
    {
        System.out.println(age+name);
    }

    public static void main(String[] args) {
        MethodOve1  methodOve1=new MethodOve1();
//        methodOve1.show("Viendra  ",40);
        methodOve1.show(40  ,"Viendra");

    }


}

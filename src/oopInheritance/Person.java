package oopInheritance;

public class Person {
    private String name;
    private double height;
    private int age;

    public Person(String name, double height, int age){
        this.name=name;
        this.height=height;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public double getHeight(){
        return height;
    }
    public int getAge(){
        return age;
    }

    public void displayAnswer(){
        System.out.println("Name is:"+name);
        System.out.println("Height is:"+height);
        System.out.println("Age:"+age);
    }
}

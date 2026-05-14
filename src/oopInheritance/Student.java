package oopInheritance;

public class Student extends Person{
    private int rollNo;


    public Student(String name,double height,int age, int rollNo){
        super(name,height,age);
        this.rollNo=rollNo;
            }

    public void displayAnswer(){
        super.displayAnswer();
        System.out.println("Rollno:"+rollNo);

    }
}

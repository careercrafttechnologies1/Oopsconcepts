package encapsulation;

public class Student {
    public String name;
    public int age;


    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }


    public String getname() {
        return name;

    }
    public void setName(){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if(age >=0 ){
        this.age = age;
        }
    }
}

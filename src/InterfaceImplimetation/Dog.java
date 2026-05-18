package InterfaceImplimetation;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog eat Food");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep after eating food");

    }

    @Override
    public void sound() {
        System.out.println("Dog Barking");
    }
}

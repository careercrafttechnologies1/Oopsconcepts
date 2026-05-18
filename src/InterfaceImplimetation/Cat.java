package InterfaceImplimetation;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat Eat fish");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping after eating a fish");
    }

    @Override
    public void sound() {
        System.out.println("Cat sounds  meow meow");
    }

}

package InterfaceImplimetation;

public class TestAnimal {
    public static void main(String[] args) {

        Dog d= new Dog();
        d.eat();
        d.sleep();
        d.sound();

        Cat c= new Cat();
        c.eat();
        c.sleep();
        c.sound();
    }
}

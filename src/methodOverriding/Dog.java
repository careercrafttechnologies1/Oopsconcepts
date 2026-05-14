package methodOverriding;

public class Dog extends Animal{
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog is Barking..........");
    }
}

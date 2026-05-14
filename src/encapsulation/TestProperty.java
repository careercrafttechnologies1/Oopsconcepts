package encapsulation;

public class TestProperty {
    public static void main(String[] args) {


        Property p=new Property("Gzb", 200,100000 );
        p.getLocation();
        p.getPrice();
        p.getSize();

        System.out.println(p.getLocation());
        System.out.println(p.getPrice());
        System.out.println(p.getSize());

    }

}

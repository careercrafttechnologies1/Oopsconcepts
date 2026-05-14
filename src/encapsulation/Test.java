package encapsulation;

public class Test {
    public static void main(String[] args) {

        BankAccount obj=new BankAccount();
//        obj.getName();
//        obj.getBalance();
        obj.setName("Vij");
        obj.setBalance(-500);

        System.out.println(obj.getName());
        System.out.println(obj.getBalance());

    }
}

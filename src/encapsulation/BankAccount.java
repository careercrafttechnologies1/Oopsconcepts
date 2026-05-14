package encapsulation;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public BankAccount() {

    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance=balance;
//            balance = amount;
        } else {
            System.out.println("Invalid amount");
        }
    }
}





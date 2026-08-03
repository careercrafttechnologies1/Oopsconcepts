package java8.optionalClass;


import java.util.Arrays;
import java.util.Optional;

public class CustomerTestOptional {
    public static void main(String[] args) {

        Customer customer = new Customer(101,"Sourav", "@souravgmail.com",
                Arrays.asList("2233445566","33445566778"));

        System.out.println("Hello, Welcome.......");
//empty Optional
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

// Of Optional
        Optional<Object> email = Optional.of(customer.getEmail());
        System.out.println(email);

        Optional<Object> id = Optional.ofNullable(customer.getId());
        System.out.println(id);
// get
        Optional<Object> email1 = Optional.ofNullable(customer.getEmail());
        System.out.println(email1);

// isPresent
        Optional<String> email2 = Optional.ofNullable(customer.getEmail());
        if(email2.isPresent()){
            System.out.println("email Found");
        }else {
            System.out.println("email not Found");
        }

// isEmpty
        Optional<String> email3 = Optional.ofNullable(customer.getEmail());
        if(email3.isEmpty()){
            System.out.println("Email is Empty");
        }

// orElse
        Optional<String> email4 = Optional.ofNullable(customer.getEmail());
        String value = email4.orElse(customer.getEmail());
        System.out.println(value);

// orElseThrow
        Optional<String> email5 = Optional.ofNullable(customer.getEmail());
        String emailNotFound = email5.orElseThrow(() -> new RuntimeException("Email Not Found......"));
        System.out.println(emailNotFound);

// ifPresent
        Optional<String> email6 = Optional.of(customer.getEmail());
        email6.ifPresent(System.out::println);
//equals()
        
        Optional<String> op1 = Optional.of("Java");
        Optional<String> op2 = Optional.of("Java");

        System.out.println(op1.equals(op2));
    }
}

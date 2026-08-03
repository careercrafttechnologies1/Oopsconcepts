package java8;

public class VotingTest {
    public static void main(String[] args) {
        Voting voting = (age) ->{
            if(age < 18){
                System.out.println("Not Eligible for Voting");
            }else {
                System.out.println("Eligible for voting");
            }
        };
        voting.check(18);
    }
}

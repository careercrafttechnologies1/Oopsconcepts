public class ThrowsDemo6 {
    static void checkPassword(String password) throws Exception{
        if(password.length() < 8){
            throw new Exception("Invalid Password try again :(");
        }
        System.out.println("Unlock password:)");
    }

    public static void main(String[] args) {
        try{
            checkPassword("sourav07");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

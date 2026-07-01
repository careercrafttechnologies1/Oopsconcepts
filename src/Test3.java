public class Test3 {
    public static void main(String[] args) {
        try {
            String st=null;
            System.out.println(st.length());
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}

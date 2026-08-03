package java8;

public class MaxTest {
    public static void main(String[] args) {

        Max m = (a, b) -> {
          if(a>b){
              System.out.println(a);
          }else {
              System.out.println(b);
          }
        };
        m.max(3,4);

    }
}

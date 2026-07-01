public class ThrowsDemo5 {

        static void c() throws Exception {
            throw new Exception("Exception in method C");
        }

        static void b() throws Exception {
            c();
        }

        static void a() throws Exception {
            b();
        }

        public static void main(String[] args) {
            try {
                a();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


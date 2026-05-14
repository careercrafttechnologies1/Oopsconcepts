package stringimplementation;

public class StringRemoveAllWhiteSpace {
    public static void main(String[] args) {
        String str1 = "   s o u r a v  ";
        System.out.println(str1);
        System.out.println(str1.trim());
        String str2 = str1.replaceAll("\\s", "");
        System.out.println(str2);

        String str3 = "  Sourav  ";
        System.out.println(str3.trim());

        String str4 = "So22u@#$r%^&8888a*****v55%%%";
        String str5 =  str4.replaceAll("[^a-zA-Z*]", "");
        System.out.println(str5);
    }
}

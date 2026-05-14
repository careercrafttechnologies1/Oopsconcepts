package stringimplementation;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s = "      JavaProgramming      ";
        System.out.println(s.length());

        System.out.println(s.toUpperCase());

        System.out.println(s.toLowerCase());

        //System.out.println(s.toCharArray());

        System.out.println(s.charAt(2));

        System.out.println(s.startsWith("J"));

        System.out.println(s.endsWith("g"));

        System.out.println(s.contains("z"));

        System.out.println(s.indexOf("v"));

        System.out.println(s.repeat(3));

        System.out.println(s.replace("JavaProgramming", "Sourav"));

        System.out.println(s.substring(8));

        System.out.println(s.substring(4));

        System.out.println(s.trim());

//        System.out.println(s.split("u"));

        // System.out.println(s.compareTo());

        String s2 = "java";
        String s3 = "java";

        System.out.println(s2.equals(s3));

        System.out.println(s2.equalsIgnoreCase(s3));

        System.out.println(s2.indexOf("a"));

        System.out.println(s2.compareTo(s3));

        String s4="Java  Python  DataScience";

        String[] arr = s4.split("  ");

            for(String x: arr) {
                System.out.println(x);
            }
    }
      String s5 = "Sourav";
    char arr[] = s5.toCharArray();


}



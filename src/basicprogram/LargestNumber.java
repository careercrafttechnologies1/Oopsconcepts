package basicprogram;

public class LargestNumber {
    public static void main(String[] args) {
        int a=31,b=93,c=63,d=5;

        if(a>b&&a>c&&a>d)
        {
            System.out.println("a = "+a);
        }
        else if (b>a&&b>c&&b>d)
        {
            System.out.println("b = "+b);
        }
        else if (c>a&&c>b&&c>d)
        {
            System.out.println("c = "+c);
        }
        else
        {
            System.out.println("d = "+d);
        }
    }
}




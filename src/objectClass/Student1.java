package objectClass;

public class Student1 implements Cloneable{
    int id = 101;

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}



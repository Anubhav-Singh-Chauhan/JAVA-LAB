package Unit_02;

public class P11_Task01_AccessProtectionInJava {
    public int a=10;
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.Display();
        obj.ShowData();
    }
}

class ParentClass {
    int a=10; //default Protection
    public int b=20; //can be accessed outside this package but within same project
    protected int c=30; //can only be accessed within same package
    private int d=40; //within Parent Class only not even in its sub-class

    void Display()
    {
        System.out.println("Inside Parent Class");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}

class ChildClass extends ParentClass{
    void ShowData(){
        System.out.println("Inside Child Class");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
//        System.out.println("d="+d);
    }
}

class Random{
    void display(){
        ParentClass obj = new ParentClass();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}

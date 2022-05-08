package Assignment_01;

class A{
    static int count=0;
    static void func(){
        count++;
        System.out.println("Function is called: "+count+" time");
    }
}
public class Q2 {
    public static void main(String[] args) {
        A obj=new A();
        obj.func();
        obj.func();
        obj.func();
        obj.func();

    }
}

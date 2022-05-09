package Assignment_01;

public class Q20 {
    public static void main(String[] args)
    {
    /*
    If we add final keyword in a class, then that class cannot be inherited by another class.
     */
    }
    final class A{
        void display()
        {
            System.out.println("class A");
        }
    }
    /*
    class B extends A (Class A cannot be inherited because it is declared final)
    {............}
     */

}

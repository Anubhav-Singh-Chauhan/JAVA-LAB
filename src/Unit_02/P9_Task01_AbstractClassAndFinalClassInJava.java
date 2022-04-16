package Unit_02;
/*
Abstract Class -> An abstract class must be declared with an abstract keyword
               -> Abstraction is a process of hiding the implementation details and showing only functionality(function
                  declarations) to the user.
               -> Can not make object of abstract class directly, but through derived class.

Final Class -> The main purpose of using a class being declared is to prevent the class from being subclassed
            -> If a class is marked as final, then no class can inherit any feature from the final class.
            -> You cannot extend a final class. If you try it gives you compile time error
 */

abstract class Bike{
    int a=10;
    Bike()
    {
        System.out.println("Inside Bike Constructor:"+a);
    }
    abstract void run(); // abstract method 0-100%

    void display()
    {
        System.out.println("Display method");
    }
}

class Honda extends Bike{
    @Override
    void run(){
        System.out.println("Run method");
    }
}

public class P9_Task01_AbstractClassAndFinalClassInJava {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.display();
        obj.run();
        //Cannot be instantiated
        // Bike obj = new Bike();

        Super obj1 = new Super();
        obj1.Display();
    }
}

final class Super{
    public int x=30;

    void Display()
    {
        System.out.println("Super Class: "+x);
    }
}
/*
public class One extends Super{
    void Display2() {
        Display();
    }
}
*/
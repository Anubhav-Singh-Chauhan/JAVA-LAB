package Unit_02;
/*
-> An interface is a completely (100%) "abstract class"
-> that is used to group related methods with empty bodies

Need Of Interface?
It is used to achieve total abstraction.
Since java does not support multiple inheritances in the case of class,
by using an interface it can achieve multiple inheritances.

->Multiple interface can be implemented at the same time in one class.
->An interface extends other interfaces.
 */

interface Animal{
    public void animalSound(); //interface method(does not have a body)
    public void run();
}

interface Human{
    public void humanSound();
    public void run1();
}

public class P12_Task01_InterfaceInJava implements Animal {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.funcA();
        obj.funcB();

        Species obj1 = new Species();
        obj1.animalSound();
        obj1.humanSound();
        obj1.run();
        obj1.run1();
    }
    public void animalSound(){
       // System.out.println("Animal Sound");
    }
    public void run(){
        //System.out.println("Animal Run");
    }
}

class Species implements Animal,Human{
    @Override
    public void animalSound(){
        System.out.println("Animal Sound");
    }

    @Override
    public void run(){
        System.out.println("Animal Run");
    }

    @Override
    public void humanSound(){
        System.out.println("Human Sound");
    }

    public void run1(){
        System.out.println("Human Run");
    }
}

interface A1{
    void funcA();
}
interface B1 extends A1{
    void funcB();
}

class C1 implements B1{
    public void funcA(){
        System.out.println("Inside FuncA from A1");
    }

    public void funcB(){
        System.out.println("Inside FuncB from B1");
    }
}

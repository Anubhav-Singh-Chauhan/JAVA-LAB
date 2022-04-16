package Unit_02;

public class P10_Task01_OverloadingAndOverridingInJava {
    public static void main(String[] args) {
        OverloadingAndOverriding obj = new OverloadingAndOverriding();
        System.out.println("Add() with two parameters");
        System.out.println(obj.add(4,6));

        System.out.println("Add() with three parameters");
        System.out.println(obj.add(4,4,4));

        Overriding obj1 = new Overriding();
        System.out.println(obj1.add(1,2));
    }
}

class OverloadingAndOverriding{
    //Within the same class: Method Overloading
    int add(int a,int b)
    {
        System.out.println("Overloading in Java");
        return a+b;
    }

    int add(int a,int b,int c)
    {
        System.out.println("Overloading in Java");
        return a+b+c;
    }
}

class Overriding extends OverloadingAndOverriding{
    // Overriding Requires Inheritance
    int add(int a, int b){
        System.out.println("Overriding in Java");
        return a+b+1;
    }

    int add(int a,int b,int c){
        System.out.println("Overriding in Java");
        return a+b+c;
    }
}
package Unit_02;

import org.w3c.dom.ls.LSOutput;

/*
->Extends Keyword
->SubClass
->SuperClass
->Feature - Code Re-usability

class derived-class-name "extends" base-class
{
  //methods and fields
}

Types of Inheritance that Java Supports:
->Single Inheritance
->Multilevel Inheritance
->Hierarchical Inheritance

Constructor Call Flow in Inheritance:
->Default Constructor -> Parameterized Constructor
 */
public class P8_Task01_InheritanceInJava {
    public static void main(String[] args) {
        Three obj3 = new Three();
        obj3.methodOne();
        obj3.methodTwo();
        obj3.methodOne();
        obj3.methodThree();

        Two obj2 = new Two(1);
        obj2.methodOne();

        D obj = new D(2);
        obj.methdoOne();
        obj.methodFour();

    }
}

class One{
     int a;
     One(int p){
         System.out.println("First Constructor");
     }
     public void methodOne(){
         System.out.println("First Method");
     }
}

class Two extends One{
    int b;
    Two(int q)
    {
        super(10);
        b=q;
        System.out.println("Second Constructor");
    }
    public void methodTwo(){
        System.out.println("Second Method");
    }
}

class Three extends Two{
    int c;
    Three(){
        super(20);
    }
    Three(int r){
        super(20);
        c=r;
        System.out.println("Third Constructor");
    }

    public void methodThree(){
        System.out.println("Third Method");
    }
}


class A{
    int a;
    A(int k){
        a=k;
    }
    public void methdoOne(){
        System.out.println(a);
    }
}

class B extends A{
    int b;
    B(int x){
        super(2);
        b=x;
    }
    public void methodTwo()
    {
        System.out.println(b);
    }
}

class C extends A{
     int c;
     C(){
         super(15);
         c=1;
     }

     public void methodThree(){
         System.out.println(c);
     }
}

class D extends A{
    int d;
    D(int y){
        super(y);
        d=y;
    }
    public void methodFour(){
        System.out.println(d);
    }
}

package Unit_03;
import java.lang.*;
import java.util.Scanner;
//Task In User Hands-:
//1. Identify dependent and non-dependent task in respective process
//2. Insert Selective task into threads
//3. Start those threads


//class C1
//{
//    void show1()
//    {
//        Scanner obj = new Scanner(System.in);
//        int a = obj.nextInt();
//        System.out.println(a);
//        System.out.println("Done with show1()");
//        obj.close();
//    }
//}
//
//class C2{
//    void show2(){
//        for(int i=0;i<10;i++)
//        {
//            System.out.println(i+" HEY_2! ");
//        }
//    }
//}

class T1 extends Thread
{
    public void run()
    {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        System.out.println(a);
        obj.close();
    }
}

class T2 extends Thread
{
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println(i+" HEY_2! ");
        }
    }
}


public class P16_MultiThreadingInJava {
    public static void main(String[] args) {
//        C1 obj1 = new C1();
//        obj1.show1();
//        C2 obj2 = new C2();
//        obj2.show2();
        Thread t1 = new Thread(new T1(), "T1");
        Thread t2 = new Thread(new T2(), "T2");
//        Thread t2 = new Thread(new T3(), "T3");
        t1.start();
        t2.start();
    }
}

package Assignment_01;

class P1{
    static int FuncCount =0;
    static int ObjCount=0;

    P1(){
        ObjCount++;
        System.out.println("Object Count: "+ObjCount);
    }
    static void display(){
        FuncCount++;
        System.out.println("Function Count: "+FuncCount);
    }
}

public class Q7 {
    public static void main(String[] args) {
        P1 obj = new P1();
        obj.display();
        P1 obj1 = new P1();
        obj1.display();
        P1 obj2 = new P1();
        obj2.display();
    }
}

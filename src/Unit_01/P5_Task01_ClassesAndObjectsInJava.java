package Unit_01;

public class P5_Task01_ClassesAndObjectsInJava {
    public static void main(String[] args) {
        XYZ obj = new XYZ();
        System.out.println("Static Display Called");
        obj.display();
        System.out.println("Non-Static Display Called");
        obj.display2();
    }
}
      class XYZ{
        int a=10;
        static int b=20;
        static void display(){
            System.out.println(b);
            //System.out.println(a); a is non-static
        }
        void display2(){
            System.out.println(a);
            //a is local variable so we cannot access it outside the method
        }
    }

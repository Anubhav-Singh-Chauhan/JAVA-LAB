package Unit_01;

/*
Wrapper Class in Java Provides the mechanism to covert primitive into object and Vice-Versa.
Why? -> If we want to use pre-defined methods of those objects
E.g. => Boolean Data Types -> Boolean obj; -> obj.toString();
 */

public class P4_Task02_WrapperClassesInJava {
    public static void main(String[] args) {
        //Converting int into Integer
        int a=10;
        String s =""+a+"";
        Integer i = Integer.valueOf(a); // Converting int into Integer explicitly
        Integer j = a; // autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a+" "+i+" "+j);
        System.out.println(i.toString());
        //System.out.println(a.toString()); cannot be done because a is int not object.

        //AutoBoxing:Converting primitives into Objects
        byte b=10;
        Byte ByteObj=b;
        System.out.println(ByteObj);

        //Unboxing: Converting Object into Primitives
        byte x=ByteObj;
        System.out.println(x);
    }
}

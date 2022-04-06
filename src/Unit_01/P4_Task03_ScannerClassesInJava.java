package Unit_01;
import java.util.Scanner;
/*
[Taking Input From the User]
1. nextLine() -> to read strings
2. next() -> read next token
3. nextBoolean() -> read a boolean value
4. nextByte() -> read a byte value
5. nextDouble() -> read a double value
6. nextFloat()
7. nextInt()
8. nextLine()
9. nextLong()
10. nextShort()
 */

public class P4_Task03_ScannerClassesInJava {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);

        String name;
        System.out.println("Enter Your First Name:");
        name=obj1.next();
        System.out.println(name);
        System.out.println("Enter your Full Name: ");
        String fullName = obj2.nextLine();
        System.out.println(fullName);

        System.out.println();

        System.out.println("Enter your Age:");
        byte b = obj2.nextByte();
        System.out.println(b);

        obj1.close(); //The close() method of java.util.Scanner class closes the scanner which has been opened.
        obj2.close();

    }
}

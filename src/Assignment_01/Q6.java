package Assignment_01;
import java.util.Scanner;

class C1{
    int sum(int a,int b)
    {
        return (a+b);
    }
    int sub(int a,int b){
        if((a-b)<0)
            return 0;
        else
            return (a-b);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        C1 obj = new C1();
        int r=((x>y) ? obj.sum(x,y) : obj.sub(x,y));
        System.out.println("Result is: "+r);
    }
}

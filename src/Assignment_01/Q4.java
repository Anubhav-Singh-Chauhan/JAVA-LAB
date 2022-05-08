package Assignment_01;

class One{
    One(int a){
//        System.out.println(a);
        System.out.println("Class One Parameterized Constructor "+ a);
    }
}

class Two extends One{
    Two(){
        super(10);
        System.out.println("Class Two Default Constructor");
    }
}

class Three extends Two{
    Three(){
        System.out.println("Class Three Default Constructor");
    }
    Three(int x){
//        System.out.println(x);
        System.out.println("Class Three Parameterized Constructor " + x);
    }
}

public class Q4 {
    public static void main(String[] args) {
    Three obj = new Three(20);
    Three obj1 = new Three();
    }
}

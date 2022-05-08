package Assignment_01;

interface In1{
    void display(int p);
}

class testClass implements In1
{
    @Override
    public void display(int p) {
        System.out.println(p);
    }
}

public class Q3 {
    public static void main(String[] args) {
        testClass obj = new testClass();
        obj.display(10);
    }
}

package Unit_01;

public class P3_Task01_VariablesAndDataTypes {
    static int a = 11;
    int p = 10;

    public static void main(String[] args){
            int a, b, c;
            double d;
            char ch;
            a = 14;
            P3_Task01_VariablesAndDataTypes obj = new P3_Task01_VariablesAndDataTypes();
            obj.typeConversionAndTypeCasting();
            System.out.println();
            System.out.println("Local a = " + a);
            System.out.println("Global a = " + obj.a);

        }

        void typeConversionAndTypeCasting ()
        {
            System.out.println("Type Conversion and Type Casting - ");
            double f;
            int i = 10;
            f = i;
            System.out.println("Value of double f = " + f);

            double g = 45.65;
            int j;
            j = (int) g;

            System.out.println("Value of int i = " + i);
            System.out.println("Value of int j = " + j);
        }
    }

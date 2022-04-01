package Unit_01;
/*Decision Making Statements:-
- if Statements
- Switch Statements

Loop Statements:-
- do while Loop
- while Loop
- for Loop
- for-each Loop

Jump Statements:-
- break statement
- continue statement
*/

public class P4_Task01_ControlAndConditionalStatementsInJava_ {

    public static void main(String[] args) {
        Statements obj = new Statements();
         obj.DecsionMakingStatements();
         obj.LoopStatements();
         obj.JumpStatements();

    }

    static class Statements{
        void DecsionMakingStatements(){
            int x=10,y=20;
            System.out.println("Decision Making Statements - if Statements, Switch case");
            System.out.println("Inside If-else Statements");
            System.out.println("Value of X is "+x+" Value of Y is "+y);
            if(x>y){
                System.out.println("X is greater than Y");
            }else{
                System.out.println("Y is greater than X");
            }
            System.out.println("Inside Swicth Case");
            int num=3;
            switch (num){
                case 1:
                    System.out.println("num is 1");
                    break;
                case 2:
                    System.out.println("num is 2");
                    break;
                default:
                    System.out.println("num is 3");
            }
        }

        void LoopStatements(){
            int n=10;
            int sum=0;
            System.out.println("\nLoop Statements");

            System.out.println("Inside For Loop");
            for (int i=0;i<n;i++){
                sum+=i;
            }
            System.out.println(sum);

            int [] arr={2,3,4,5,6,7};

            System.out.println("Inside For-each Loop");
            for (int x: arr ) {
                System.out.println(x);
            }

            System.out.println("Inside While Loop");
            int i=10;
            while(i<15){
                System.out.println(i);
                i++;
            }

            System.out.println("Inside do-While Loop");
            int k=2;
            do{
                System.out.println("Printing value of k: "+k); //This Loop Runs atleast once.
            }while(k>5);

        }

        void JumpStatements(){
            System.out.println("\nJump Statements");
            System.out.println("Break Statement");
            for (int i=0;i<10;i++){
                if(i==6){
                    break;
                }
                System.out.print(i+" "); //1,2,3,4,5
            }
            System.out.println();
            System.out.println("Continue Statement");
            for (int i=0;i<10;i++){
                if(i==6){
                    continue;
                }
                System.out.print(i+" "); //1,2,3,4,5,7,8,9
            }
        }
    }
}

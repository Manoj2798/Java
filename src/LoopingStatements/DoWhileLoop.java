package LoopingStatements;

/**
 * @author Manoj
 * This class explains about the use of DoWhileLoop
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        //Also called as Exit Controlled Loop. The loop will execute once and then the condition will be checked.

        //Printing Upto 10 on to the console
        int start = 1;
        int end = 10;
        do{
            System.out.print(start + " ");
            start++;
        }while(start<=end);

//        Note: In the above case, do block will execute once before checking the condition, if the condition is not met, then it comes out of the loop.

        //Infinite Do while loop
        do{
            System.out.println("Eat,Sleep,Code,Repeat");
        }while(true);

        //Note: Here the while statement must terminate with a semicolon.

        //Using a boolean literal in while expression
       /* boolean flag = true; // This will result in an unreachable code
        do{
            System.out.println("dont Stop");
        }while(flag = false);*/
    }
}

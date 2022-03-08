package LoopingStatements;

/**
 * @author Manoj
 * This class is all about learning While Loop
 */
public class WhileLoop {
    public static void main(String[] args) {
        // While Loop is an Entry Controlled Loop, which means if the condition, is not met, then we cannot execute the block.

        //Basic Example
        //Printing number upto 10
        int n = 10;
        int i = 1;
        while(i<=n)
        {
            System.out.print(i + " ");
            i++; // updation statement
        }

        //Note : As long as the condition meets, the loop keeps on getting executed until the condition returns false.
        // Syntax for a while Loop
        /*
            while(Boolean Expression)
            {
                statement to be executed;
                updation;
            }
         */
    }
}

package LoopingStatements;

/**
 * @author Manoj
 * This class is all about learning While Loop
 */
public class WhileLoop {
    public static void main(String[] args) {
        // normal way of printing number onto console
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        //The above method does the work, but increases the lines of code if the logic changes ie if we wish to print upto 50
        // this will result into code redundancy and code repetition.

        // We can solve the above issue using Looping constructs


        // While Loop is an Entry Controlled Loop, which means if the condition, is not met, then we cannot execute the block.
//          While Loop helps us to remove code redunduncy.

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

        //Other things that can be used in while expression
       /* boolean flag = true;
        while(flag) // since there is no termination condition, it will go in infinite Loop condition.
        {
            System.out.println("Hello");
        }*/

        //Ex2
        boolean flag = false;
        while(flag = true) // flag is assigned the value true, so the boolean exp is true, it goes again in infinite Loop.
        {
            System.out.println("Print me");
        }
    }
}

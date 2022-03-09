package LoopingStatements;

/**
 * @author Manoj
 * This class tells us about For loop
 */
public class ForLoop {
    public static void main(String[] args) {
        // Printing Hello world 5 times using while Loop
       /* int cnt = 5;
        int i = 1;
        while(i<=cnt)
        {
            System.out.println("Hello World");
            i++;
        }*/

        // For Loop Syntax
        /*
            for(initialization;condition:increment/decrement)
            {
                Statements to be executed
            }
         */

        //Note: there are many variations of For Loop, we can declare the variable outside the block and do initialization,
        // increment/decrement operation can be done within the block.
        /*
            int i;
            for(i = 0;i<10;i++)
            {

            }

            Syntax 3:
            int i;
            for(i = 0; i< 10; )
            {
                statement;
                i++/i--;
            }

         */

        System.out.println("-------------------------------------------------");
        //solving the above question using for loop

       /* int j;
        for(j = 0; j< 10; j++)
        {
            System.out.println("Hello World");
        }

        // OR

        int k;
        for(k = 0; k < 5;)
        {
            System.out.println("Hello Java");
            k++;
        }*/

        System.out.println("---------------------------------------------------------");
        // Infinite For Loop Condition
       /* for(;;)
        {
            System.out.println("Run till stack overflow");
        }*/

        //2nd Case
       /* for(;true;) // Here , the condition statement accepts boolean value, since it sees true(Compile-time constant), the loop will never become false.
            //Hence it results in infinite Loop Condition
        {
            System.out.println("Run Again");
        }*/

        //if we give false
       /* for(;false;) // since for loop first checks the condition before entering the block, it will never enter as false is a compile-time-constant.
        {
            System.out.println("Not Executed"); // This results in an unreachable code error.
        }*/

        //Note: for loop condition statement, accepts only boolean values,
        /*int i;
        for(i=1;0;i++) // 0 is not a boolean value. hence it give compile time error.
        {
            System.out.println("Print the Printline");
        }*/

        //Suppose we dont mention the increment/decrement operation
        /*for(int i = 0;i<10;)
        {
            System.out.println("Hello");
        }*/
        //Note: Since there is no increment/decrement operation, the terminating condition will never meet, hence, it will result in an infinite For Loop.


        // We can have a for loop without a body too;
        /*int i;
        for(i=0;i<10; System.out.println("The value of I is : " +i++) )
        {

        }*/

        //Example
       /* for(int i=10;i>=1;i++); // here the for loop will not run as, it is terminated with a semicolon
        {
            System.out.println(i); // i is undeclared in this case
        }*/
    }
}

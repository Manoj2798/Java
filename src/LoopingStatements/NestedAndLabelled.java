package LoopingStatements;

/**
 * @author Manoj
 * This class is all about Learning Nested Statements
 */
public class NestedAndLabelled {
    public static void main(String[] args) {
        //Nested If :If block inside another if block is called Nested if.
        int age = 23;
        double height = 150; // height in cms

        /*if(age >= 10)
        {
            if(height > 155)
            {
                System.out.println("You can enjoy the Indiana Jones Adventure Ride");
            }
        }else
        {
            System.out.println("Sorry, you are below 10 years of Age");
        }*/

        // Note: Always check for corresponding if and else blocks, orelse we will end up with unexpected output.
        //For Ex
        if(age >= 10)

            if(height > 155)

                System.out.println("You can enjoy the Indiana Jones Adventure Ride");

        else

            System.out.println("Sorry, you are below 10 years of Age");

//        Note: The above issue occured as, we have not used proper blocks to mention the condition,now in this case, the else block corresponds to the inner if and
        // when the inner if condition fails, else blocks executes.

        System.out.println("--------------------------------------------------------");
        //Nested If Examples
        int duration = 3;
        if(duration > 2) // 1
            if(duration > 4) // 2
                if(duration<7) // 3
                    System.out.println("A");
            else // 3
                System.out.println("B"); // Output : B
        else // 2
            System.out.println("C");

        System.out.println("------------------------------------------------------------");
        // Nested For
        //Basically, the outer for loop is used for rows and inner for loop for the columns.

        //Basic Example: To print a Square. 5X5
        for(int i = 0; i < 5;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

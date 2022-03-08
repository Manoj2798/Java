package ControlStatements;

/**
 * @author Manoj
 * This class explains the use of If and If-else statement.
 */
public class IfElseStatement {
    public static void main(String[] args) {
        //Syntax :
        /*
            if(Boolean expression)
            {
                if expression is true, it executes this block.
            }

            --> if there is only a single statement to be executed then block is optional.
            if(boolean Expression)
                statement to be executed..

            --> if there are more than one statement, then block is mandatory.
            if(boolean Expression)
            {
                statement 1
                statement 2
                .....
            }

            --> if there is a condition, involving 2 situation, then we can go for if-else
            if(boolean expression)
            {
                exp is true
            }else{
                exp is false

            }
         */

        //Example
        int marks = 68;
        if(marks >= 60 && marks <= 70)
            System.out.println("You scored 1st class");

        // if-else Example
        int age = 17;
        if(age>= 18)
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible");

        System.out.println("---------------------------------------");

        // if block with multiple statements
        int score = 80;
        if(score >= 80)
        {
            System.out.println("You have got grade A");
            System.out.println("You progress is Excellent");
        }else
        {
            System.out.println("You need to work harder");
        }

        System.out.println("---------------------------------------------");
        // if-block variations
        if(score == 100) // here score 80, so there should be no o/p, but line 67 is getting printed, so in such cases, we should use blocks , if the are more than 1 statements.
            System.out.println("Congratulations you scored full marks");
            System.out.println("You have topped");

        System.out.println("---------------------------------------------");
            // if-else Examples
        int time = 11;
        if(time >= 12)
        {
            System.out.println("Good Afternoon");
        }else
        {
            System.out.println("Good Morning");
        }

        System.out.println("--------------------------------------------");
//        int flag = 1;
//        if(flag = 1) // here boolean expression is expected but we have assignment expression
//            System.out.println("true");
//        else
//            System.out.println("false");

        //ex2
        boolean flag = true;
        if(flag) // it is similar to flag == true
            System.out.println(true);
        else
            System.out.println(false);


    }


}

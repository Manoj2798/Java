package ControlStatements;

/**
 * @author Manoj
 * This class Explains about If-elseIf-else Ladder
 */
public class IfElseIfStatement {
    public static void main(String[] args) {
        // It is also called as if-elseif-else ladder.

        //Ex1.
        int score = 80;
        if(score >= 70 && score <=99 )
            System.out.println("You have secured Distinction");
        else if(score > 45 && score < 60)
            System.out.println("You have secured 2nd Class");
        else if(score >= 60 && score <70)
            System.out.println("You have secured 1st Class");
        else
            System.out.println("You have failed the test");

        // Note: else block in if-elseif ladder is optional

        System.out.println("-------------------------------------");

        /*
        Write a program to implement the foll logic:
        --> if hour is less than 12 noon, greet with good morning
        --> if hour is greater or equal to 12 noon and less than 15(3pm) greet with good Afternoon
        --> if hour is greater or equal to 15 then greet with good evening.
       */
        byte hour = 18;
        if(hour < 12)
            System.out.println("Good morning");
        else if(hour < 15)
            System.out.println("Good Afternoon");
        else
            System.out.println("Good Evening");

        System.out.println("-----------------------------------------");
        System.out.println("Solution with only if-else");

        if(hour < 12)
            System.out.println("Good Morning");
        else
        {
            if(hour < 15)
                System.out.println("Good Afternoon");
            else
                System.out.println("Good Evening");
        }
        System.out.println("-----------------------------------------");

    }


}

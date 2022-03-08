package ControlStatements;

/**
 * @author Manoj
 * This class tells us about the use case of switch statement
 */
public class SwitchCase {
    public static void main(String[] args) {
        // Consider an ex: print the day of the week based upon the code..ex 1--> monday and so on

//        //Approach using if-elseif
//        byte dayOfweek = 2;
//        if(dayOfweek == 1)
//            System.out.println("Monday");
//        else if(dayOfweek == 2)
//            System.out.println("Tuesday");
//        else if(dayOfweek == 3)
//            System.out.println("Wednesday");
//        else if(dayOfweek == 4)
//            System.out.println("Thursday");
//        else if(dayOfweek == 5)
//            System.out.println("Friday");
//        else if (dayOfweek == 6)
//            System.out.println("Saturday");
//        else if(dayOfweek == 7)
//            System.out.println("Sunday");
//        else
//            System.out.println("Invalid Day");
//

       /* byte day = 1;
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid entry");
        }*/

        // Note: Case Values must be compile time constants,
        // Compile time constants are those constants, which are final and are initialised when declared;
        //Ex final int num = 10;
        // final int n;
        // n = 200; // here n is not a compile time constant

        //Switch Example 2:
        byte var = 65;
        final byte a = 10;
        final byte b;
        b = 40;
        switch(var) // Switch expression is of byte type
        {
            case a: // Value is 10, it is compile time constant and within byte range
                System.out.println(1);
                break;
            case a*5: //Value is 50, it is again a compile time constant and within the byte range.
                System.out.println(2);
                break;
            /*case a * 50: // It is a compile time contant but its outside the range of byte
                System.out.println(3);
                break;*/
           /* case b: // Here b is not a compile time constant hene it is not allowed.
                System.out.println(4);
                break;*/
            case '\u0041': //ALlowed, it character 'A', decimal value 65 is well within byte range.
                System.out.println(5);
                break;
            /*case '\u20B9': //Not Allowed, Indian rupee symbol, because it decimal value is out of the range of byte.
                System.out.println(6);
                break;*/

        }
        System.out.println("--------------------------------------------------");
        // Switch Example 3
        /*
        Display Traffic Light using the following Logic
        --> if code(R/r) --> "RED"
        --> if Code(O/o) --> "ORANGE"
        --> if Code(G/g) --> "GREEN"
        --> Otherwise --> "Invalid Color Code"
         */

//        Note: We can use String in Switch case from Java 7 onwards
//        String colorCode = "r";
//        switch(colorCode)
//        {
//            case "r":
//                System.out.println("Traffic Light is red");
//                break;
//            case "R":
//                System.out.println("Traffic Light is Red");
//                break;
//            case "o":
//                System.out.println("Traffic Light is Orange");
//                break;
//            case "O":
//                System.out.println("Traffic Light is Orange");
//                break;
//            case "g":
//                System.out.println("Traffic Light is green");
//                break;
//            case "G":
//                System.out.println("Traffic Light is Green");
//                break;
//            default:
//                System.out.println("Invalid Color");
//
//        }

        // Note: Default statement need not be the last statement, it can be the first, last or anywhere in the switch case, if none of the
        // the cases matches then, the default block or statement gets executed.

        // Note: Suppose if there is no break statement used, then all the statements below it will be executed till it encounters a break or finishes the switch case.

//        Ex:
//        String colorCode = "o";
//        switch(colorCode)
//        {
//            case "r":
//                System.out.println("Traffic Light is red");
//
//            case "R":
//                System.out.println("Traffic Light is Red");
//
//            case "o":
//                System.out.println("Traffic Light is Orange"); // here o will be picked and since there is no break, all the statements will be printed untill it encounters a break statement or end of switch.
//
//            case "O":
//                System.out.println("Traffic Light is Orange");
//
//            case "g":
//                System.out.println("Traffic Light is green");
//
//            case "G":
//                System.out.println("Traffic Light is Green");
//
//            default:
//                System.out.println("Invalid Color");
//
//        }

        // better solution to the previous code
        String colorCode = "r";
        switch(colorCode)
        {
            case "r":
            case "R":
                System.out.println("Traffic Light is Red");
                break;
            case "o":
            case "O":
                System.out.println("Traffic Light is Orange");
                break;
            case "g":
            case "G":
                System.out.println("Traffic Light is Green");
                break;
            default:
                System.out.println("Invalid Color");

        }


    }
}

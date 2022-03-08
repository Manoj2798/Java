package ControlStatements;

public class CodingChallenge {
    public static void main(String[] args) {
        /*if marks < 60, then print "Fail"
        if marks >= 60 but less than 90 , then print "Pass"
        if marks >= 90, then print "Passed with Distinction"*/

//        using if
        /*int marks = 75;
        if(marks < 60)
            System.out.println("Fail");
        if(marks >= 60 && marks < 90)
            System.out.println("Pass");
        if(marks >= 90)
            System.out.println("Passed with Distinction");*/

        // using if-else
//        int marks = 50;
//        if(marks < 60)
//            System.out.println("Fail");
//        else
//        {
//            if(marks < 90)
//                System.out.println("Pass");
//            else
//                System.out.println("Passed with Distinction");
//        }

        // using if-elseif ladder
        int marks = 90;
        if(marks < 60)
            System.out.println("Fail");
        else if(marks < 90)
            System.out.println("Pass");
        else
            System.out.println("Pass with Distinction");

        System.out.println("------------------------------------------------------------");

        /*Write a logic using switch-case to print "EVEN" / "ODD" for the numbers.
        Numbers divisible by 2 are even and numbers not divisible by 2 are odd.*/

        int num = 22;
        switch(num%2)
        {
            case 0:
                System.out.println("The number is Even");
                break;
            case 1:
                System.out.println("The number is Odd");
                break;
        }

        System.out.println("-----------------------------------------------------------");

//        Write a Java Program to solve Question 2 using ternary operator (?:)
        int number = 423;
        String out = (number % 2 == 0)? "Even":"Odd";
        System.out.println("The given Number is : " +out);

        System.out.println("-------------------------------------------------------------");

//        Write a Java Program to solve Question 1 using ternary operator (?:)
        int score = 88;
        String msg = (score < 60)? "Fail" : (score < 90) ? "Pass" : "Pass With Distinction";
        System.out.println(msg);
    }
}

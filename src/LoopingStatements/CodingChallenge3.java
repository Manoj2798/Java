package LoopingStatements;

public class CodingChallenge3 {
    public static void main(String[] args) {
        /*Question 1:

        Print the table of 12 using for loop.
                Output should be in following format:
        12 X 1 = 12
        12 X 2 = 24
        12 X 3 = 36
        12 X 4 = 48
        12 X 5 = 60
        12 X 6 = 72
        12 X 7 = 84
        12 X 8 = 96
        12 X 9 = 108
        12 X 10 = 120*/

        for(int i=1;i<=10;i++)
        {
            System.out.println("12 X " +i + " = " +12*i);
        }

        System.out.println("------------------------------------------------------");

        /*Question 2:
        Solve Question-1 using while loop.*/
        int j=1;
        while(j<=10)
        {
            System.out.println("12 X " +j + " = " +12*j);
            j++;
        }

        System.out.println("-----------------------------------------------------");
                /*Question 3:
        Write a Java program to print all the numbers between 1 and 100 (including 1 and 100)
        which are divisible by 5.*/

        for(int k = 1;k<=100;k++)
        {
            if(k%5 == 0)
                System.out.print(k+ " ");
        }

        System.out.println("----------------------------------------------------------");
        /*Question 4:
        Print the multiples of 5 starting from 200 to 5 with following restrictions:
        1. Use for loop
        2. Don't use modulus (%) operator to check whether number is divisible by 5 or not.*/

        int start = 200;
        int end = 5;
        for(int l=start;l>=end;l=l-5)
        {
            System.out.print(l + " ");
        }
    }
}

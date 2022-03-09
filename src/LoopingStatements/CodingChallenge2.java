package LoopingStatements;

public class CodingChallenge2 {
    public static void main(String[] args) {
       /* Question 1:
        Use pre-decrement operator in while's boolean_expression to print HELLO 5 times on to the console.*/

        int i = 5;
        while (--i >= 0) // Since its pre-decrement, the first value is skipped, so we should go upto 0 and not 1
        {
            System.out.println("Hello");
        }

        System.out.println("------------------------------------------------");
        /*Question 2:
        Write a program to calculate the sum of the numbers from 1 till upper bound.
                If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
        If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
        If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.*/

        int Ubound = 11;
        int j = 1;
        int sum = 0;
        while (j <= Ubound) {
            sum = sum + j;
            j++;
        }
        System.out.println("The sum of the numbers upto " + Ubound + " : " + sum);

        /*Question 3:
        Write a program using while loop to print Even numbers from 1 to 100.*/


        int k = 1;
        while (k <= 100) {
            if (k % 2 == 0)
                System.out.println(k);
            k++;
        }

        /*Question 4:
        Write a program for following logic:
        Print all the odd numbers in comma separated form from 1 till end (you may change it):
        if end = 10, OUTPUT = 1, 3, 5, 7, 9
        if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

        You should use while loop and if - else statements. Note that, there should not be any comma after last digit.*/

        int ctr = 15;
        int t = 1;
        while (t <= ctr) {
            if (t % 2 != 0) {

/*
    1,3, ...........13,15
 */
                System.out.print(t);

                if (ctr % 2 == 0) { // Even
                    if (t != (ctr - 1))
                        System.out.print(", ");

                }else {

                    if (t != ctr)
                        System.out.print(", ");

                }
            }
            t++;

        }
    }
}

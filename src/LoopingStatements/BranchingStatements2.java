package LoopingStatements;

public class BranchingStatements2 {
    public static void main(String[] args) {
       /* Write a Java program to print all the numbers between 1 and 100 (including 1 and 100)
  which are divisible by 5.*/

        //Continue statement: this statement when used skips the current iteration and moves to the next iteration.
      /*  for(int i=1;i<=100;i++)
        {
            if(i%5!=0) // if the number is not divisble by 5 then it skips the current iteration and moves to the next iteration
                continue;
            else
                System.out.print(i + " ");
        }*/

        //Use of Continue and Labelled break together
       /* int search = 50;
        int count = 0;
        outer:
        for(int i=1;i<=100;i++)
        {
            for(int j=1;j<=20;j++)
            {
                int num = i*j;
                *//*System.out.print(num + " ");*//*
                if(num == search)
                {
                    count++;
                    if(j == 1)
                    {
                        break outer; // if the element is at the first column, then break out of the inner loop to the next row
                    }
                    continue outer; // if the element is found, then continue with next iteration.
                }

            }

        }
        System.out.println("The number of times : " +search + " has appeared is : " +count);

    }*/

        // Return Statement : when return is encountered, the control comes back to the place from where it was called, for main method its is JVM.

//    Ex:

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i == 7)
                return; // when this is encountered, control returns back to JVM.
        }
    }
}



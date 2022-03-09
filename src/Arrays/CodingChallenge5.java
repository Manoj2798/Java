package Arrays;

public class CodingChallenge5 {
    public static void main(String[] args) {
        /*Question 1:

        Write a Java Program to store numbers from 1 to 1000 in One-dimensional array and then print array contents as follows (10 elements per row):
        1    2    3    4    5    6    7    8    9    10
        11    12    13    14    15    16    17    18    19    20
        21    22    23    24    25    26    27    28    29    30
                .
.
.
        991    992    993    994    995    996    997    998    999    1000*/

        int[] numbers = new int[1001];
        //Assigning the value
        for(int i =1;i<numbers.length;i++)
        {
            numbers[i] = i;
        }
        int count = 0;
        //Printing the values,10 in each row
        for(int j=1;j<numbers.length;j++)
        {
            System.out.print(numbers[j] + " ");
            count++;
            if(count == 10)
            {
                System.out.println();
                count = 0;
            }
        }

        /*Question 2:
        Write a Java program to store numbers 1 to 10 in an array using data instantiation.
        Then write a for loop to multiply each member of above array by 19, this way you will get table of 19 stored in the above array.
                Finally write another for loop to print all the array elements.
                You should get following output:
        19
        38
        57
        76
        95
        114
        133
        152
        171
        190*/

        int[] arr = {1,2,3,4,5,6,7,8,9,10}; // array instantiated

        for(int i = 0; i< arr.length;i++)
        {
            System.out.println(arr[i]*19);
        }


        System.out.println("-----------------------------------------------------");


        /*Question 3:
        Below is One-dimensional array code:
        char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};

        Write the code to search for particular character in above array.
                If I search for 'B', then output should be: "B found!"
        If I search for 'E', then output should be: "E Not found!"*/


        char [] array = new char[] {'A','Z','B','N','P','T','X','C'};

        char search = 'D';
        for(int i = 0; i<array.length;i++)
        {
            if(i == array.length-1 && search!=array[i])
            {
                System.out.println(search+ " Not found");
            }

            if(array[i] != search) {
                continue;
            }
            else {
                System.out.println(search + " found!");
                break;
            }



        }




        /*Question 4:
        short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
        Above array stores the scores of a batsman in his last 10 innings in the game of cricket.
        To know more about cricket, you can visit Wikipedia link: https://en.wikipedia.org/wiki/Cricket
        If score is greater than or equal to 50 but less than 100, it is regarded as half-century.
                If score is greater than or equal to 100 but less than 200, it is regarded as a century.
                If score is greater than or equal to 200, it is regarded as a double-century.


                NOTE: No scenario of triple-century in this case.

        Write the code to print the number of half-centuries, centuries and double-centuries scored by the batsman.*/

        short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
        int half = 0;
        int full = 0;
        int doubleCentury = 0;

        for(int i = 0; i < scores.length;i++)
        {
            if(scores[i] >=50 && scores[i] < 100)
                half++;
            else if(scores[i]>=100 && scores[i] < 200)
                full++;
            else if(scores[i]>=200)
                doubleCentury++;
        }

        System.out.println("The number of half centuries were : " +half);
        System.out.println("The number of centuries are : " +full);
        System.out.println("The number of double centuries are : " +doubleCentury);


        /*Question 5:
        In mathematics, the Fibonacci series are the numbers in the following integer sequence:
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
        By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
                and each subsequent number is the sum of the previous two.

        Write a Java Program to generate above series till n number of times (For example you can try with
                n = 10 and n = 15) and store it in One-dimensional array.
                For n = 10, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        For n = 15, Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377

        Write a for loop to print all the elements of the array.*/

        int[] fib1 = new int[10];
        int[] fib2 = new int[15];

        int first = 0;
        int second = 1;
        fib1[0] = 0;
        fib1[1] = 1;
        System.out.print(fib1[0] + " " + fib1[1] + " ");
        for(int i = 2;i<fib1.length;i++)
        {
            fib1[i] = first + second;
            System.out.print(fib1[i] + " ");
            first = second;
            second = fib1[i];
        }

        fib2[0] = first;
        fib2[1] = second;
        System.out.print(fib2[0] + " " + fib2[1] + " ");
        for(int i=2;i<fib2.length;i++)
        {
            fib2[i] = first + second;
            System.out.print(fib2[i] + " ");
            first = second;
            second = fib2[i];
        }

        System.out.println("Printing the elements of both Arrays : ");
        for(int i=0;i<fib1.length;i++)
        {
            System.out.print(fib1[i] + " ");
        }

        System.out.println("-------------------------------------------------");
        for(int i = 0;i<fib2.length;i++)
        {
            System.out.print(fib2[i] + " ");
        }

    }
}

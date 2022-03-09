package Arrays;

public class ArrayIteration {
    public static void main(String[] args) {
        //Simple old Array Indexing
        int[] numbers = new int[5];

        //assigning values manually
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println("The values of the Array is : ");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        //Note: this approach is not recommended as when the size of the Array will be more, there will be more lines of code.
        // Instead go for, for loop

        System.out.println("----------------------------------------------------------------------------------------");

        String[] names = new String[4]; // this will create a memory with null assigned

        // Assigning values
        names[0] = "Manoj";
        names[1] = "Priya";
        names[2] = "Ganesh";
        names[3] = "Punitha";

        // Reading the values
        for(int i=0;i< names.length;i++)
        {
            System.out.println(names[i]);
        }

        System.out.println("----------------------------------------");

        int [] num = new int[4];
         // Assigning values using for loop
       ;
        for(int k = 0,j=10; k<num.length;k++,j = j+10)
        {
            num[k] = j;

        }

        //Printing the values using for loop
        for(int it = 0; it<num.length;it++)
        {
            System.out.println(num[it]);
        }
    }
}

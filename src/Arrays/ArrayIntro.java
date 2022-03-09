package Arrays;

/**
 * @author Manoj
 * This class tells us about the introduction to arrays, and why we need arrays
 */
public class ArrayIntro {
    public static void main(String[] args) {
        // variable approach
        int sub1 = 85;
        int sub2 = 70;
        int sub3 = 90;

        double average = (sub1 + sub2 + sub3)/3;
        System.out.println("The average score of the student is : " +average);

        // This approach is good when we have less number of values to be stored..
        // But when we wish to store large number of data and access them too easily,, in that cas we go for Arrays

        // Array basic syntax

//        datatype array_name[] = new datatype[size];

//        Note: Array is a object which stores collection of similar items.
        //Array is static hence, we need to mention its size during initialization.
        //Object Array can store heterogenous data.
        // Arrays can be of Primitive or user-defined types.

        int[] scores; // declaration of an Array
        scores = new int[4]; // initialization, this will create a memory in heap and initialize with 0

        //Printing the values
        /*System.out.println(scores[0]); // 0 , since default value of Int is 0
        System.out.println(scores[1]); // 0
        System.out.println(scores[2]); // 0
        System.out.println(scores[3]); // 0
        */

        // Assigning values
        scores[0] = 80;
        scores[1] = 70;
        scores[2] = 80;
        scores[3] = 90;


        //Printing the values after assigning
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);


        //Note : Array Indexing starts from 0
        //Note : if we try to access a value outside the mentioned range of an array, it will result in ArrayIndexOutOfBoundException

        System.out.println("-------------------------------------------------------------");
        // Example: printing the value of Primitive type and Arrays
        int number = 20;
        String name = "Hoodi";
        int[] arr = new int[10];

        System.out.println(number); // Prints the value 20
        System.out.println(name); // Prints value Hoodi
        System.out.println(arr); // Prints value [I@13969fbe

        // String class has overriden the toString method and hence it prints the object content and not object hascode
        // when we print the array address, then we get the hashcode of the memory block.

        System.out.println("----------------------------------------------------------");
        // Solution to the previous problem

        /*int[] marks = new int[3]; // this creates a marks array in the heap segment, marks reference pointing to that memory location
        // Assigning the marks of 3 subjects of a student.
        marks[0] = 76;
        marks[1] = 86;
        marks[2] = 91;

        double mean = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("The average of the 3 subjects is : " +mean);*/

        System.out.println("-------------------------------------------------------------");

        System.out.println("Calculating Average score using for loop.......");
        int[] marks = new int[3]; // this creates a marks array in the heap segment, marks reference pointing to that memory location
        // Assigning the marks of 3 subjects of a student.
        marks[0] = 76;
        marks[1] = 86;
        marks[2] = 91;
        double mean = 0.0;
        int sum = 0;

        for(int i=0;i<marks.length;i++)
        {
            sum += marks[i];
        }
        mean = sum/3;
        System.out.println("The average of the 3 subjects is : " +mean);


    }
}

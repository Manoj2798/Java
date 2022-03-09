package Arrays;

public class ReferenceArray {
    public static void main(String[] args) {
        String[] names = new String[5]; // String array is declared and initialized which means, null values is stored in the memory addresses

        // Accessing the memory elements
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        // ASsigning values to Array
        names[0] = "Ravi";
        names[1] = "Ramesh";
        names[2] = "Rajiv";
        names[3] = "Raghu";
        names[4] = "Ritesh";
       // names[5] = "Siddharth"; // Since array size is of 5 elements only and index starts from 0, this element is not allowed and hence it throws error.

        //Accessing the values after assigning
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        //printing a negative array index
        //System.out.println(names[-1]); // it is a runtime exception, and is not identified during compile time

        //Accessing other values
        System.out.println(names[15]); // arrayindexOutOfBound
//        System.out.println(names[9999999999]); // outside the range of Int;
      //  System.out.println(names[99L]); // required int index provided Long

    }
}

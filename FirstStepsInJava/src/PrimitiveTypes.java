public class PrimitiveTypes {
    public static void main(String[] args) {
        //Primitive Types in Java : There are 8 primitive Types in Java
        /*
            1.byte - 1byte  : Range : -2^n-1 to (2^n-1)-1 where n = no of bits, for byte, n = 8;
            2.short - 2byte
            3.int - 4byte
            4.long - 8byte
            5.char - 2byte
            6.float - 4byte
            7.double - 8byte
            8.boolean - JVM dependent/No size
         */

        //1. Byte dataType : It is a signed integer
        byte val1 = 25; // decimal value
        byte val2 = 0B1111; // binary value
        byte val3 = 0x2B; // hexadecimal
        byte val4 = 030; // octal number

        System.out.println(Byte.MIN_VALUE); // Prints the minimum range of byte  : -128
        System.out.println(Byte.MAX_VALUE); // Prints the maximum range of byte : 127

        //-----------------------------------------------------------------------
        // How negative numbers are stored in memory(using 2's complement)
        //1. first represent the number in binary form
        //2. find the 1's complement (flip the bits)
        //3. Add binary 1 to it.

        byte value = -30;
        System.out.println(value);
        byte value1 = -0B1010;
        System.out.println(value1);

        // Note: if MSB = 1, then the number is negative, if MSB = 0, then number is a positive number.
       // byte num = 129; // out of range
       // byte v = -129; // out of range
        System.out.println("--------------------------------------------------------------");
        //-----------------------------------------------------------------------------------------
        //2. short datatype : It is a signed integer, its size is of 2 bytes i.e 16 bits.

        System.out.println("The min value of short is : " +Short.MIN_VALUE); //prints the minimum value of short
        System.out.println("The max value of short is : " +Short.MAX_VALUE); //prints the maximum value of short

        short s1 = 1234;
        short s2 = -12121;
        short s3 = 10_000; // underscore is allowed, and its basically used for better readability, Ex : 10,000 : here , is not allowed in java
        System.out.println(s1 + " " + s2 + " " + s3);
        System.out.println("-------------------------------------------------------------");
        //----------------------------------------------------------------------------------------
        //3. int datatype : It is a signed number, its size is of 4 bytes i.e 4*8 = 32 bits
        System.out.println("The min range of int is : " +Integer.MIN_VALUE);
        System.out.println("The max range of int is : " +Integer.MAX_VALUE);

        int i1 = 2_12_234;
        int i2 = -1235678;
       // int i3 = -2147483649; // out of range, not allowed
        // Note: By default all integral values are stored as integers only in java.
        System.out.println("------------------------------------------------------------");
        //-------------------------------------------------------------------------------------

        // Long datatype: It is a Signed Number, it can store int range values + more data. Its size is of 8bytes or 64 bits.
        System.out.println("The max range of Long : " +Long.MAX_VALUE); // prints the max value of Long
        System.out.println("The min range of Long : " +Long.MIN_VALUE); // prints the min value of Long

        //Note: for values out of range of int, we should suffix the values by L or l. orelse it gives an error(Int value too large).

        long val = 1234; // automatic typeCasting happens internally
        long var1 = 123456l; // l is optional as, the number is in the range of int.
        long var2 = 2345678912L; // Here Suffix is mandatory as , The number is out of the range of int and needs to be expressed as Long.

        long creditCardNumber = 4532_7865_8888_0000L; // stored as 4532786588880000, note L is necessary for source code only...
        System.out.println(creditCardNumber);

        System.out.println("-------------------------------------------------------------");
    //--------------------------------------------------------------------------------------------------------------------------------

        // Floating point Numbers
        // Note : by default all floating numbers are stored as double in java.
        // we have 2 datatypes to store Floating point numbers : float : double
        // 1. FLoat : It can store both positive and negative numbers, It is of 4bytes or 32 bits.
        // --> if we want to explicitly mention, numbers as float, then we need to suffix the value with F or f.
        //--> for double it is optional to mention d or D, as by default all floating numbers are stored as double
        // --> There are 2 notation for floating point numbers : standard notation : scientific notation.

       // float f1 = 234.56; // if we want to store values as float, them f or F is mandatory.
        float f1 = 23.56F; // standard notation
        float f2 = 234E2f; // scientific notation
        System.out.println(f2);
        System.out.println(f1);

        double d1 = 32.33; // it is a simple double value
        double d2 = -2456e7; // scientific notation
        double d3 = 3.14753647890;
        System.out.println(d3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("-------------------------------------------------------------------------------");
        // ---------------------------------------------------------------------------

        // Char datatype : it is of 2 bytes i.e 16 bits.
        System.out.println("The min range of Char : " +Character.MIN_VALUE); // \u0000
        System.out.println("The max range of Char : " +Character.MAX_VALUE); // \uffff

        // we can store both character and int values provided they lie in the range of 0 to 65535
        char c1 = 198;
        char c2 = 'A';
        char c3 = 3200;
      char c4 = '\u00F5';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // Note : all character values can be assigned to int, but they will be stored with their corresponding decimal values only.
        int in1 = '\u00F5';
        System.out.println(in1);
        int in2 = '\u20B9';
        System.out.println(in2);
        System.out.println("-----------------------------------------------------------");

        // Boolean : It stores only 2 values: true : false
        Boolean status = true;
        System.out.println("Eligible to vote : " +status);

        // Boolean cannot store other primitive types
        //Boolean flag = 0; // not allowed
        //Boolean temp = 1; // not allowed

       // Boolean condition = "false"; // This is also an incorrect statement or value passed.


    }
}

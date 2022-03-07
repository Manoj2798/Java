/**
 * this class tells about the various type of operators
 */
public class Operators {
    public static void main(String[] args) {
        // Arithmetic operator : + : - : / : % : *
        // note: the numbers are called as operands

//        int num1 = 20;
//        int num2 = 40;
//        System.out.println(num1 + num2); // 20 + 40
//
//        int n1 = 50;
//        int n2 = 20;
//        System.out.println(n1-n2); // 50 - 20
//
//        int v1 = 80;
//        int v2 = 10;
//        System.out.println(v1 / v2); // gives the quotient
//        System.out.println(v1 % v2); // gives the remainder
//
//        int ex1 = 5;
//        int ex2 = 10;
//        System.out.println(ex1 * ex2); // 5 * 10

        int i1 = 10;
        int i2 = 15;
        float f1 = 23.5f;
        double d1 = 32.7;
        String str = "Java";
        System.out.println(i1 + i2); // Addition, result will give an int
        System.out.println(i2 + f1); // Addition, result will give a float
        System.out.println(f1 + d1); // Addition, result will give a double
        System.out.println(i1 + str); // Concatenation will happen, as one of them is string

        // TypeCasting are of 2 types: Implicit type casting : Explicit type casting
        //1. Implicit Typecasting : This is casting from lower datatype to a higher datatype . which is done internally by the compiler.
         byte b1 = 25; // here int is internally converted to byte as , the number is well within the range of byte.
         byte b2 = 34;

         byte res1 = (byte)(b1+b2); // Addition of 2 byte will internally be converted to int, so to store in byte we need to explicitly typecaste
        // Note: In explicit typeCasting, there is a possibility of data loss while conversion.

        float fval = 20.3f;
        int val = (int)fval; // here the decimal part will be truncated, leaving 20.
        System.out.println(val);

        int n1 = 15;
        int n2 = 20;
        float res2 = n1 + n2; // Implicit TypeCasting will be done , other name is Type promotion.

        //Note : The Result of expression involving the Arithmetic operation on 2 int-sized or lesser datatypes will always be an int.
        // so there is a need to typeCaste it accordingly to out needs.

        System.out.println("----------------------------------------------");
        // Subtraction :
        int num1 = 30;
        int num2 = 22;
        float f2 = 3.5f;
        double d2 = 9.0;

        int sub1 = num1 - num2; // result will be an int
        float sub2 = num1 - f2; // result will be a float
        double sub3 = num1 - d2; // result will be a double
        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(sub3);

        System.out.println("-------------------------------------------------");

        //Multiplication

        int mul1 = num1 * num2; // result will be an int, int * int
        float mul2 = num1  * f2; // result will be in float, int * float
        double mul3 = num1 * d2; // result will be in double, int * double
        System.out.println(mul1);
        System.out.println(mul2);
        System.out.println(mul3);

        System.out.println("------------------------------------------------");

        //Division

        int div1 = num1 / num2; // result will be an int, num1 / num2
        float div2 = num1 / f2; // result will be a float, num1 / f2
        double div3 = num1 / d2; // result will be a double, num1 / d2
        System.out.println(div1);
        System.out.println(div2);
        System.out.println(div3);

        System.out.println("------------------------------------------------");

        //Modulus : This operator is used when we want to find the remainder.

        int mod1 = num1 % num2; // result will be an int
        float mod2 = num1 % f2; // result will be a float
        double mod3 = num1 % d2; // result will be a double

        System.out.println("--------------------------------------------------");

        // Unary Operators : Unary operators are those operators which are applied on a single variable or entity.

        // Unary +, Unary -
        // These operators resembles a number as positive or negative

        long pos = +200; // represents whether a number is positive or negative
        double neg = -234.67;

        System.out.println("---------------------------------");

        // Increment(++), decrement(--) operators
        // These operators are further classified as : pre-increment, post-increment, pre-decrement,post-decrement
        // pre - when the operand is prefixed by the operator, then it is called as pre - operation
        // post - when the operand is suffixed by the operator, then it is called as post-operation.

        int a = 10;
      //  System.out.println(a++); // this statement will first print the value of a and then increment the value of a by 1
        // The above is an example of Post increment
        System.out.println(a); // in the previous expression, we had post incremented the value of a , i.e  the value of a is 11

        // Pre increment Example
        int b = 22;
      //  System.out.println(++b); // Pre increment means increment the value first and then print.

        //combination of pre and post increment
        System.out.println(a++ + ++a); // here a initially is 10
        //                 10  + 12 == 22

        //Post decrement and Pre-decrement
        int c = 22;
        System.out.println("The post decremented value is : " +c--);// here the value first gets printed and then the value will be decremented by 1
        System.out.println("The value after post decrement :" +c); // here the decremented value will be printed.

        int d = 20;
        System.out.println("The pre-decrement of d is : " +--d);

        System.out.println("-------------------------------------");
        //combination of post decrement and pre decrement

        int e = 10;
        int last = e-- + e-- +--e; // (10) ---9----> + (9) ----8----7---> +(7) = 26
        System.out.println(last); // 26
        System.out.println(e); // 7

//        ---------------------------------------------------------------
        System.out.println("-------------------------------------------");
    // Combination of All
    int f = 5;
    int dec =  f++ + ++f + ++f + --f + --f; // (5)--6--7--> + (7) --8 --> + (8) ---7--> + (7) ---6--> (6) = 33
        System.out.println(dec); // 33
        System.out.println(f);// 6








    }
}

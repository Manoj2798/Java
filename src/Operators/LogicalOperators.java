package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // We have Logical AND,Logical OR, Bitwise AND, Bitwise OR
        int i1 = 5;
        int i2 = 10;
        int i3 = 5;
        int i4 = 8;
        //Logical AND --> returns true if both the conditions, evaluate to true. It first checks for the first condition,
        // if that turns out to be false, then it won't go ahead.
        System.out.println((i1 == i2) && (i3 == i4)); // here i1 != i2, therefore it wont check further
        System.out.println((i1 == i3) && (i2 == i4)); // here i1 is equal to i3, so it goes to next condition and fails there
        // Truth Table for Logical AND
        /*
            op1     op2     res
            false   false   false
            false   true    false
            true    false   false
            true    true    true ---> only condition where it satisfies
         */
        System.out.println("--------------------");
        // Bitwise AND
        System.out.println(i1&i2); // here it performs bitwise operation
        /*
            i1 = 0101
            i2 = 1010
            i1&i2 = 0000
         */
        System.out.println((i1 == i3) & (i2 == i4)); // in this case its gives, true only when both conditions are true.

        System.out.println("-----------------------------------------------");
        // Logical OR - when either of the condition or both satify, then it gives true. It is a short circuit operator.
        // It checks for the first statement, if thats true, then it skips the other condition.

        System.out.println("(i1 == i2)||(i3 == i4) : " +((i1 == i2)||(i3 == i4))); // here both the conditions, evaluate to false, hence output is false
        System.out.println("(i1 == i3)||(i2 == i4) : " +((i1 == i3) || (i2 == i4))); // since the first condition evaluates to true, the output is true.
        /*
            Truth table for Logical OR

            op1     op2     res
            =====================
            false   false   false
            false   true    true
            true    false   true
            true    true    true
            =====================
         */
        System.out.println("-----------------Bitwise OR-------------------------");
        //Bitwise OR - This is not a short circuit operator, it evaluates both the condition before returning an answer
        System.out.println(i1|i2); // performs bitwise OR operation and give the result
        /*
            i1 = 0101
            i2 = 1010
            ----------
         i1|i2 = 1111 ---> 15
         */

        System.out.println("(i1 == i2) | (i1 == i3) : " +((i1 == i2) | (i1 == i3))); // This evaluates to true, as first condition is false and 2nd statement is true
        System.out.println("---------------------------------");
        // Bitwise Exclusive OR
        /*
            Truth table for Bitwise ExOR
            ====================
            op1     op2     res
            false   false   false
            false   true    true  --- only for these condition its gives true
            true    false   false ---
            true    true    false
         */
        //Ex:
        System.out.println("(i1 == i2) ^ (i1 == i3) : " +((i1 == i2) ^ (i1 == i3))); // This evaluates to true, condition1 = false, condition2 = true.
        System.out.println("(i1 == i3) ^ (i2 != i4) : " +((i1 == i3) ^ (i2 != i4))); // This evaluates to false, condition1 = true, condition2 = true.

        System.out.println("--------------------ternary operator---------------------");
        // Ternary operator : It accepts three expressions, one is the condition, other 2 expressions will be selected based on the condition.
        // expr1 ? expr2 : expr3
        //if expr1 ---> true, then expr2 will be executed
        //if expr1 ---> false, then expr3 will be the executed.
        // it is similar to an if-else control statement.

        int temp = 27;
        String day = (temp >= 30)?" is a Sunny Day" : " is a windy Day";
        System.out.println("Today" +day);

        int time = 11;
        String s = (time >= 12)? "PM":"AM";
        System.out.println("It is " +time +s);

    }
}

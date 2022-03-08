package Operators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10-5-5); // here it will execute, left to right.
        // ((10-5)-5) -----------> 0

        int a = 100;
        a = --a + a++ + a-- + a++;
        /*
            (((--a + a++) + a--) + a++) --> ((((99 + 99)) + a--)+a++)--> (198 + 100) + a++ ---> 298 + 99 = 397
         */
        System.out.println("The value of a is : " +a); // 397

        System.out.println("--------------------------------------------------------");

        a = 1;
        a = -a-- + a++ / -a-- * --a;
        /*
            ((-(a--)) + (((a++) / (-(a--))) * (--a)))
            ((-1) + ((0 / (-1)) * (-1)) --> (-1 + 0) ---> -1
         */
        System.out.println("The value of a is : " +a);

        System.out.println("-----------------------------------------------------------");
        a = 2;
        boolean res = a++ == 2 || --a == 2 && --a == 2;
        /*
            res = (((a++) == 2) || (((--a) == 2) && ((--a) == 2));
                    ((2) == 2) || () --- > since left condition is true, it wont execute the right hand-side.
                res = true
                a = 3
         */
        System.out.println("Res = " +res);
        System.out.println("The value of a : " +a);

        System.out.println("-------------------------------------------------------------");
        a = 20;
        int var = --a * a++ + a-- - --a;
        /*
            ((--a) * (a++)) + (a--)) - (--a));
            (19 * 19) + (20) - (18) ---> 361 + 20 - 18 = 363, a = 18
         */
        System.out.println("a = " + a);
        System.out.println("var = " + var);

        System.out.println("-------------------------------------------------------------");

        a = 7;
        boolean result = a++ == 7 && ++a == 9 || a++ == 9;
        /*
            result = (((a++) == 7) && ((++a) == 9)) || ((a++) == 9));
                       (((7) == 7) && ((9) == 9)) ||  () -----> Here the first condition evaluates to true, so the 2nd condition wont be evaluated.
                       result ---> true, a = 9
        */
        System.out.println("a = " + a);
        System.out.println("res = " + result);
    }
}

package Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        // =,+=,-=,/=,*=,%=
        int num1 = 10;
        int num2 = 12;
        int num3 = 6;
        int num4 = 5;
        int temp;

        temp = num1; // assigns value from right to left
        System.out.println("The value of temp is : " +temp);

        num1+=num2; // internally it does, num1 = num1 + num2; these are alse called as shortHand operators.
        System.out.println(num1); // 10+12 = 22

        temp -= num4; // works as, temp = temp - num4;
        System.out.println(temp); // 10-5 = 5

        num3 *=num4; // num3 = num3*num4;
        System.out.println(num3); // 6*5 = 30

        num3 /= temp; // num3 = num3 / temp;
        System.out.println(num3); // 30/5 = 6

        num1 %= temp; // num1 = num1 % temp;
        System.out.println(num1); // 22%5 = 2

    }

}

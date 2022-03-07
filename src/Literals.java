/**
 * This is a JavaDoc Comment
 * Class which tells about integer Literals
 */
public class Literals {
    public static void main(String[] args) {
        //Number Literal : Decimal : Octal : Hexadecimal : Binary
        int number = 20; // decimal number
        int n1 = 0x80; // Hexadecimal : preceded by 0x
        int value = 020; // Octal : preceded by 0
        int binary = 0B1111; // binary : preceded by 0B

        System.out.println(number);
        System.out.println(n1);
        System.out.println(value);
        System.out.println(binary);

        // Floating Literals
        System.out.println(1223456.890); // Standard Notation
        System.out.println(1223456E2); // Scientific Notation

        // Boolean Literals
        System.out.println(true); // boolean accepts only 2 values : true : false
        System.out.println(false);

        // character Literals
        // Characters are enclosed within Single Quotes
        System.out.println('A'); // prints A
        System.out.println('a'); // prints a
        System.out.println('\n'); // prints a newline character and brings cursor on next line
        System.out.print('\t'); // prints a tab space
        System.out.println("\\"); // prints a \ line

        //we can print a character using unicode too
        System.out.println('\u0042'); // prints character B
        System.out.println('\u0058'); // prints character X
        System.out.println('\u20B9'); // Indian rupee symbol
        System.out.println('\u096A'); // number 4 in devnagri
        System.out.println('\u23F3'); // hourglass symbol

        //String Literal : Literals enclosed within double quotes.
        System.out.println(""); // Empty String
        System.out.println(" "); // Single Space will be printed
        System.out.println("A"); // Here A is not a character instead it is a String literal
        System.out.println("Hello\n"); // Prints word Hello and brings the cursor on the next Line due to \n(newline escape character)

        // Null literal : Literal usually assigned to object references

        String name = null;
        Object obj = null;

    }
}

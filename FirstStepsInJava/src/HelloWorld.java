public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World.... this is the first code");
//-------------------------------------------------------------------
        // ----> Used for Single Line Comments
        /* --> Used for Multi line comments */
//--------------------------------------------------------------------
        // --> Access specifiers that can be used for outer classes only are : public : default(do not mention any specifier)
 //-------------------------------------------------------------------
//     Identifiers should start with A-Za-z or special symbols include only (_,$ or indian rupee symbol)
        int roll = 20;
        String name = "Manoj";
        //String 1Str = "String"; // Error as identifiers cannot begin with numbers
        // note: keywords cannot be used as Identifiers
       // Ex: String void = "null"; here void has predefined meaning so cannot be used as Identifier

//        -----------------------------------------------------------------
        // breakup of main method
        // public static void main(String[] args)
        /*public --> access specifier which makes visibility to global
           static --> static members are shared across all the instances of the class
                  --> to call static members, objects of the class need not be created. we can call static methods/members
                  using className
           void  ---> void means the method does not return any value
           main ---> it is the name of the method
           String[] args ---> this is command line arguments, the values passed to the main function during runtime.

           ---> This method is the Entry point for execution of Java Program. JVM invokes this method at the beginning and maintains an
           activation record of main method in the stack. this AR gets destroyed once main method comes to an end.
           -----------------------------------------------------------------
           System.out.println(); --> this will print whatever is passed and moves the cursor to the next line.
           System.out.print(); --> this statement will print the content and keeps the cursor on the same line.
         */


    }
}

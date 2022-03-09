package LoopingStatements;

/**
 * @author Manoj
 * This class tells us about Branching statements in Java
 */
public class BranchingStatements {
    public static void main(String[] args) {
        // Break; this statement is used when we want to break out from a loop
        //Ex:
        int limit = 20;
        for(int i = 1;i<=100;i++)
        {
            System.out.print(i + " ");
            if(i == limit)
                break;
        }

        System.out.println("------------------------------------------------");

        // Nested For Loops with Labelled Breaks
        int search = 25;
        outer:
        for(int i = 1; i<=100;i++)
        {
            for(int j=1;j<=10;j++)
            {
                int num = i*j;
                System.out.print(num);
                if(num == search)
                    break outer;
            }
            System.out.println();
        }
    }
}

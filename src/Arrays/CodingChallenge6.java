package Arrays;

public class CodingChallenge6 {
    public static void main(String[] args) {
        /*Question 1:
        Write a java program to create a 2-Dimensional array of 8 * 8 size [to resemble chess board] and
        initialize all the array elements starting from 1 till 64 (using for loop) as follows*/

        int[][] chess = new int[8][8];
        int start = 1;
        for(int i=0; i< chess.length; i++)
        {
            for(int j=0; j< chess[i].length; j++)
            {
                chess[i][j] = start;
                start++;
            }
        }

        System.out.println("The contents of the Array are : " );
        for(int i=0; i< chess.length; i++)
        {
            for(int j=0;j< chess[i].length;j++)
            {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}

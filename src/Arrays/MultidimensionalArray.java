package Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // Multidimensional Arrays : 2D,3D...... and so on....most commonly used multidimensional Arrays are 2D arrays.

        //2D array declaration
//        int[][] arr; // most widely used declaration
//        int[] array[];
//            int arr[][];

        // Different ways of instantiating a 2D Array...
        int[][] arr = new int[2][]; // 1st way, by mentioning the size of first brackets

        //2nd Way-------
        int[][] array = new int[2][2]; // we can mention both the sizes.

        //we cannot do instantiation this way...
//        int[][] a = new int[][3]; // this is illegal declaration

        //Also we cannot specify the size of Array during Array declaration.
//        int[4][4] a; // this is not allowed

        //------------------------------------------------------------------------------------->
        System.out.println("Assigning Values to MultiDimensional Array : ");

        array[0][0] = 10;
        array[0][1] = 20;
        array[1][0] = 30;
        array[1][1] = 40;
//        array[2][2] = 80; // this will result in runtime exception

        System.out.println("Printing the values of MultiDimensional Array :  ");
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
        System.out.println(array[1][0]);
        System.out.println(array[1][1]);

        System.out.println("Printing values of Multidimensional Array using For Loop : ");
        for (int i = 0; i < array.length; i++)
        {
            for(int j = 0; j< array[i].length;j++)
            {
                System.out.println(array[i][j]);
            }
        }

        // Asymmetric 2D array
        int[][] num = new int[3][];
        num[0] = new int[2];
        num[1] = new int[1];
        num[2] = new int[3];

        System.out.println("Printing the values : ");
        for(int i=0; i<num.length;i++)
        {
            for (int j=0;j<num[i].length;j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");

        // Reference Type 2D Arrays
        String[] name = new String[]{
                "Manoj","Rahul","Rajiv"
        };

        //Displaying the contents of Name Array
        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }

        System.out.println("--------------------------------------------------------");
        //2D Array
        String[][] colors = new String[][]{
                {"1","Red"},{"2","Orange"},{"3","Blue"},{"4","White"}
        };

        //Accessing the contents of colors Array
        for(int i=0;i< colors.length;i++)
        {
            for(int j=0; j<colors[i].length;j++)
            {
                System.out.println(colors[i][j]);
            }
        }

        System.out.println("--------------------------------------------------------");


    }
}

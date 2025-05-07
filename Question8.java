// Question_08.java
// To display the multi dimentional arrusing nested loops and user input

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first dimention: ");
        int dim1 = input.nextInt();
        

        int[][] marks = new int[dim1][];

        for(int c=0;c < marks.length;c++){
        	System.out.print("How many arrays " +c +" ");
        	int dim2 = input.nextInt();
        	marks[c] = new int[dim2];
        }

        System.out.println("Enter the array elements:");

        // Taking input from the user
        for (int c = 0; c < marks.length; c++) {
            for (int d = 0; d < marks[c].length; d++) {
                marks[c][d] = input.nextInt();
            }
        }

        System.out.println("The array elements are:");

        // Displaying the array elements
        for (int c = 0; c < marks.length; c++) {
            for (int d = 0; d < marks[c].length; d++) {
                System.out.print(marks[c][d] + " "); 
            }
            System.out.println(); 
        }

        System.out.println("End of the program!!!");
         
    }
}

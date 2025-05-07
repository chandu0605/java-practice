// Question_06.java
// To display the multi dimentional arrusing nested loops and user input

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] marks = new int[4][3];

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

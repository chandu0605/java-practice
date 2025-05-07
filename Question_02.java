// Question_02.java
// to add the sum digits of a number by using while loop

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        
        int sum = 0;
        int temp = Math.abs(num); 
        
        while (temp > 0) {
            sum += temp % 10; 
            temp /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
        System.out.println("End of the prograam..");
    }
}

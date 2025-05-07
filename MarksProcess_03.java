//MarksProcess_03.java
//ProcessMArks using array
//2. Update the program to use user given elements into the array
//3. update the prgram to use user given size and user given elements into the array

import java.util.Scanner;
public class MarksProcess_03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter size of the marks :");
		int size = input.nextInt();
		

		int []marks = new int[size];
		System.out.println("Enter marks below :");
		

		for(int c=0;c<marks.length;c++){
			marks[c] = input.nextInt();
		}
		System.out.println("Marks :");
		

		for(int c=0;c<marks.length;c++){
			System.out.println(marks[c]);
		}
		System.out.println("End of the Program!!!");
	}
}
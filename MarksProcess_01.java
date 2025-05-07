//MarksProcess_01.java
//ProcessMArks using array

public class MarksProcess_01{
	public static void main(String[] args){
		int []marks = new int[5];
		System.out.println("Enter marks below :");
		for(int c=0;c<5;c++){
			marks[c] = (c*10)+15;
		}
		System.out.println("Marks :");
		for(int c=0;c<5;c++){
			System.out.println(marks[c]);
		}
		System.out.println("End of the Program!!!");
	}
}
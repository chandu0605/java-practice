//Array_02.java

import java.util.Scanner;

public class Array_02{
	public static void main(String[] args){
		Scanner input=new Scanner(Syste.in);
		//int[][] a=new int[3][3];

		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
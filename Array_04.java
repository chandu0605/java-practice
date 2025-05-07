//Array_04.java
//the max and min num

public class Array_04{
	public static void main(String[] args){
		int[] a={23,7,19,26,10,28};

		int max=a[0];
		int min=a[5];

		for(int i=0;i<a.length;i++){

			if(a[i]>max){
				max=a[i];
			}

			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("the max number is: "+max);
		System.out.println("the min number is: "+min);
	}
}
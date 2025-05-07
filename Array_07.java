//Array_07.java
//to find the duplicate nubers

//26.7.19.26.10.28

public class Array_07{
	public static void main(String[] args){

		int[] a={26,7,19,26,10,28};
		int same=a[0];

		for(int i=0;i<a.length;i++){
			if(same==a[i]){
				same=a[i];
			}
		}
		System.out.println("the dup value: "+same);
	}
}
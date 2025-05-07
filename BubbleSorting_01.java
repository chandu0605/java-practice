public class BubbleSorting_01{
	public static void main(String[] args){
		int []num = {36,19,25,12,6};
		int temp;

		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length-1;j++){
				if(num[j]>num[j+1]){

					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;

				}
			}
		}

		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
			}
			System.out.println();
			System.out.println("End of the program........");


	}
}
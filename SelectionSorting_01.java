public class SelectionSorting_01 {
    public static void main(String[] args) {
        int[] arr = {34,12,23,16,21,10};

        // Selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

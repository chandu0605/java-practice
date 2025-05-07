public class Array_05 {
    public static void main(String[] args) {
        int[] a = {23, 7, 19, 26, 10, 28};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax && a[i] != max) {
                secondMax = a[i];
            }
        }

        System.out.println("Second largest number: " + secondMax);
    }
}

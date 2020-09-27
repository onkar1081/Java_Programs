package arraymaxminelement;
import java.util.Scanner;
public class ArrayMaxMinElement {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = ob.nextInt();
        int[] arr = new int[size];
        int i;
        int max, min;
        System.out.println("Enter array elements...");
        for (i = 0; i < size; i++) {
            arr[i] = ob.nextInt();
        }
        max = arr[0];
        for (i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        min = arr[0];
        for (i = 1; i < size; i++) {
            if (arr[i] <min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Element in the array is " + max);
        System.out.println("Minimum Element in the array is " + min);
    }
}

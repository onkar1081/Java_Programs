package linearsearch;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = ob.nextInt();
        int[] arr = new int[size];
        int i, c = 0;
        System.out.println("Enter array elements...");
        for (i = 0; i < size; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int num = ob.nextInt();
        for (i = 0; i < size; i++) {
            if (num == arr[i]) {
                c++;
                break;
            }
        }
        if (c != 0) {
            System.out.println(num + " is present in the array");
        } else {
            System.out.println(num + " is not present in the array");
        }
    }
}

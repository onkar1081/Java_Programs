package copyarray; 
import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = ob.nextInt();
        int[] arr = new int[size];
        int[] arr1= new int[size];
        int i;
        System.out.println("Enter array elements...");
        for (i = 0; i < size; i++) {
            arr[i] = ob.nextInt();
        }
        for (i = 0; i < size; i++) {
            arr1[i] = arr[i];
        }
        System.out.println("Copied array elements are....");
        for (i = 0; i < size; i++) {
            System.out.println(arr1[i]);
        }        
    }
}

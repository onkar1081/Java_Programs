package reversearray;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=ob.nextInt();
        int[] arr=new int[size];
        int i;
        System.out.println("Enter array elements...");
        for(i=0;i<size;i++)
        {
            arr[i]=ob.nextInt();
        }
        System.out.println("Reverse Array is...");
        for(i=size-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }   
}

package sumofarray;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Ener size of array");
        int size=ob.nextInt();
        int[] arr=new int[size];
        int i,sum=0;
        System.out.println("Enter array elements.........");
        for(i=0;i<size;i++)
        {
            arr[i]=ob.nextInt();
        }
        for(i=0;i<size;i++)
        {
            sum=sum+arr[i];
        }    
        System.out.println("Addition of array elements is "+sum);  
    }   
}

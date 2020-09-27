package arrayaverage;
import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=ob.nextInt();
        int[] arr=new int[size];
        int i,sum=0;
        double avg;
        System.out.println("Enter array elements...");
        for(i=0;i<size;i++)
        {
            arr[i]=ob.nextInt();
        }
        for(i=0;i<size;i++)
        {
            sum=sum+arr[i];
        }
        double newsize=(double)size;
        avg=sum/(newsize);
        System.out.println("Average of array elements is "+avg);  
    }   
}

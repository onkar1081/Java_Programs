package arrayindex;
import java.util.Scanner;
public class ArrayIndex {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=ob.nextInt();
        int[] arr=new int[size];
        int i,c=0;
        System.out.println("Enter array elements...");
        for(i=0;i<size;i++)
        {
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter the element whose index you want");
        int num=ob.nextInt();
        for(i=0;i<size;i++)
        {
            if(num==arr[i])
            {
                 c++;
                 break;
            }
        }
        if(c!=0)
        {
            System.out.println("The index of the number is "+i);   
        }
        
        else
        {
            System.out.println("The number is not present in the array");
        } 
    }    
}

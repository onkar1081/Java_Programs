package oddeven;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=ob.nextInt();
        if(num%2==0)
        {
            System.out.println(num+" is Even Number");
        }
        else
        {
            System.out.println(num+" is Odd Number");
        }
        
    }
    
}

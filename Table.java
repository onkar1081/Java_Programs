package table;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number");
        int n=ob.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(i*n);
            i++;
        }
        
    }
    
}

package areacircle;
import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        float a,r;
        System.out.println("Enter radius");
        r=ob.nextFloat();
        a=3.14f*r*r;
        System.out.println("Area is "+a);
    }
    
}

package methodoverloading;
class A {
    void add(int x, int y)
    {
        System.out.println("Int add called");
        System.out.println(x+y);
    }
    void add(double x,double y)
    {
        System.out.println("Double add called");
        System.out.println(x+y);
    }
}
public class MethodOverloading {

    public static void main(String[] args) {
        A ob=new A();
        ob.add(8.14,5.65);
        ob.add(45,72);
        
    }
}
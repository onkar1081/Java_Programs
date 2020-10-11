package singleinheritance;
class A
{
    void add(int x,int y)
    {
        System.out.println(x+y);
    }
}
class B extends A
{
    void sub(int x,int y)
    {
        System.out.println(x-y);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        B ob=new B();
        ob.add(10, 20);
        ob.sub(100,50);
    }
}

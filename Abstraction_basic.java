package demo1;
abstract class Test{
    abstract void add(int x,int y);
    abstract void sub(int x,int y);    
}
class NewTest extends Test{
    @Override
    void add(int x, int y) {
        System.out.println(x+y);
    }    
    @Override
    void sub(int x, int y) {
        System.out.println(x-y);
    }   
}
public class Demo1 {
    public static void main(String[] args) {
       NewTest ob=new NewTest();
       ob.add(50,60);
       ob.sub(100,20);
    }   
}

package superkeyword;
class A{
    int i;
    A(){
        i=10;
        System.out.println("In class A");
    }
}
class B extends A{
    int i;
    B(){
        i=20;
        System.out.println("In class B");
    }
    void add()
    {
        System.out.println(i+super.i);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        B ob=new B();
        ob.add();
    }   
}

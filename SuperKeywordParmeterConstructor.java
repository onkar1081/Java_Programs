package superkeywordparmeterconstructor;
class A{
    int i;
    A()
    {
        i=10;
        System.out.println("Constructor without args called");
    }
    A(int x)
    {
        i=x;
        System.out.println("Constructor with args called");
    }
}
class B extends A{
    int i;
    B()
    {
        super(50);
        i=20;
        System.out.println("In class B");
    }
    void add()
    {
        System.out.println(i+super.i);
    }
}
public class SuperKeywordParmeterConstructor {
    public static void main(String[] args) {
        B ob=new B();
        ob.add();
    }   
}

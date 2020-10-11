package methodoverriding1;
class A extends Object{
    @Override
    public String toString() {
        return "This is obj of class A"; 
    }   
}
class B extends A{
    @Override
    public String toString() {
        return "This is obj of class B"; 
    }    
}
public class MethodOverriding1 {
    public static void main(String[] args) {
        A ob1=new A();
        B ob2=new B();
        System.out.println(ob1);
        System.out.println(ob2);
    }   
}

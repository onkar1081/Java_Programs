package runtimepolymorphism;
class A{
    void read()
    {
        System.out.println("Read from Hdd");
    }
}
class B extends A{
    void read()
    {
        System.out.println("Read from Dvd");
    }
}
class C extends B{
    void read()
    {
        System.out.println("Read from Usb");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        A ob1=new A();
        B ob2=new B();
        C ob3=new C();     
        show(ob1);
        show(ob2);
        show(ob3);
    }   
    static void show(A r)
    {
        r.read();
    }
}

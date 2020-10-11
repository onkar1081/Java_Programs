package abstraction_animal;
abstract class Animal{
    abstract void sound();
}
class Lion extends Animal{
    @Override
    void sound()
    {
        System.out.println("Roar");
    }
}
class Dog extends Animal{
    @Override
    void sound()
    {
        System.out.println("Bark");
    }
}
public class Abstraction_Animal {
    public static void main(String[] args) {
        Lion ob1=new Lion();
        Dog ob2=new Dog();
        show(ob1);
        show(ob2);
    }
    static void show(Animal r)
    {
        r.sound();
    }
}

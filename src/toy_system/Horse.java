package toy_system;

public class Horse extends Animal{
    public void gallop(){
        System.out.println("clop clop clop");           // horsing around
    }
    @Override
    public void eat(){
        NormalEater.eat();
    }
}

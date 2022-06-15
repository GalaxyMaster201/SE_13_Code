package toy_system;

public class Bird extends Animal{
    public void fly(){
        System.out.println("wheeee");           // because flying is fun
    }
    @Override
    public void eat(){
        PeckingEater.eat();
    }
}

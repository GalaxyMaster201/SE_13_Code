package toy_system;

public class Pig extends Animal{
    public void grunt(){
        System.out.println("oink oink");        // pig go oink
    }
    @Override
    public void eat(){
        NormalEater.eat();
    }

}

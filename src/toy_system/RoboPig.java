package toy_system;

public class RoboPig{

    private final Pig p = new Pig();
    private final Robot r = new Robot();

    public void beep(){
        r.beep();
    }

    public void grunt(){
        System.out.println("oink oink");        // pig go oink
    }
}

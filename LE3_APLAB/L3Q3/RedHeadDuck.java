// RedHeadDuck class
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new CanFly(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a RedHead Duck.");
    }
}

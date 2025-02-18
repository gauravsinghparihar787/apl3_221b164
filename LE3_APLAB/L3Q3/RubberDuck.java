// RubberDuck class
public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new CannotFly(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}

// Implementation of QuackBehavior for ducks that are mute
public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}

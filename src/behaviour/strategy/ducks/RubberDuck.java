package behaviour.strategy.ducks;

import behaviour.strategy.flyBehaviours.Flapping;
import behaviour.strategy.quackBehaviours.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        super(new Flapping(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck. Don't I look like one!");
    }
}

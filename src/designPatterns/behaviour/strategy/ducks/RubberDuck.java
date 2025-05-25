package designPatterns.behaviour.strategy.ducks;

import designPatterns.behaviour.strategy.flyBehaviours.Flapping;
import designPatterns.behaviour.strategy.quackBehaviours.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        super(new Flapping(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck. Don't I look like one!");
    }
}

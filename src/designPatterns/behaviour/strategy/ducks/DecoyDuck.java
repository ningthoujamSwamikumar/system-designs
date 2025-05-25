package designPatterns.behaviour.strategy.ducks;

import designPatterns.behaviour.strategy.flyBehaviours.NoFly;
import designPatterns.behaviour.strategy.quackBehaviours.SilentQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        super(new NoFly(), new SilentQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a decoy duck. I don't have any real designPatterns.behaviour.");
    }
}

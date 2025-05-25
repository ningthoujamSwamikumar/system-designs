package designPatterns.behaviour.strategy.quackBehaviours;

import designPatterns.behaviour.strategy.ducks.Duck;
import designPatterns.behaviour.strategy.flyBehaviours.NormalFly;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new NormalFly(), new NormalQuack());
    }

    @Override
    public void display() {
        System.out.println("THis is a Red Head Duck. I have a red head right?");
    }
}

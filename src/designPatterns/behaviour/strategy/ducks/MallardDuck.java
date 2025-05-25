package designPatterns.behaviour.strategy.ducks;

import designPatterns.behaviour.strategy.flyBehaviours.NormalFly;
import designPatterns.behaviour.strategy.quackBehaviours.NormalQuack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        super(new NormalFly(), new NormalQuack());
    }

    @Override
    public void display() {
        System.out.println("This is a mallard duck. I look like mallard right?");
    }
}

package behaviour.strategy.quackBehaviours;

import behaviour.strategy.ducks.Duck;
import behaviour.strategy.flyBehaviours.NormalFly;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new NormalFly(), new NormalQuack());
    }

    @Override
    public void display() {
        System.out.println("THis is a Red Head Duck. I have a red head right?");
    }
}

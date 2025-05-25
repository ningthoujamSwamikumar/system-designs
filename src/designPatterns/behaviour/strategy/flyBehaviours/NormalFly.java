package designPatterns.behaviour.strategy.flyBehaviours;

public class NormalFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying normally!");
    }
}

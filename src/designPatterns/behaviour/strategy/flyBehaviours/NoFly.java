package designPatterns.behaviour.strategy.flyBehaviours;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("No fly designPatterns.behaviour");
    }
}

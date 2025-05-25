package designPatterns.behaviour.strategy.flyBehaviours;

public class RocketPoweredFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Using rocket to fly! Weeew!");
    }
}

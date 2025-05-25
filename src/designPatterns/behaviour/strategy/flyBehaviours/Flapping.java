package designPatterns.behaviour.strategy.flyBehaviours;

public class Flapping implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I am flapping my winds to look like I am flying, but I can't really fly because I am a rubber duck.");
    }
}

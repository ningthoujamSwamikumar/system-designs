package designPatterns.behaviour.strategy.quackBehaviours;

public class SilentQuack implements QuackBehaviour {
    @Override
    public void quick() {
        System.out.println("This is a silent quack.");
    }
}

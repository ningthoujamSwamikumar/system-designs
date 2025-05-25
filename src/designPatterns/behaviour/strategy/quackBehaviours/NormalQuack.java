package designPatterns.behaviour.strategy.quackBehaviours;

public class NormalQuack implements QuackBehaviour {
    @Override
    public void quick() {
        System.out.println("Normal Quack!");
    }
}

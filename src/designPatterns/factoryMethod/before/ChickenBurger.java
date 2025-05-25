package designPatterns.factoryMethod.before;

public class ChickenBurger implements Burger {
    public ChickenBurger() {
        System.out.println("Creating Chicken Burger");
    }

    @Override
    public void serve() {
        System.out.println("Serving Chicken Burger");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing your chicken burger");
    }
}

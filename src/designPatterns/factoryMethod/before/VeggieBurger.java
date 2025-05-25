package designPatterns.factoryMethod.before;

public class VeggieBurger implements Burger{
    public VeggieBurger() {
        System.out.println("Creating Veggie Burger");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing your veggie burger");
    }

    @Override
    public void serve() {
        System.out.println("Serving Veggie Burger");
    }
}

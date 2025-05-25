package designPatterns.factoryMethod.before;

public class CheeseBurger implements Burger{
    public CheeseBurger() {
        System.out.println("Ordered Cheese Burger");
    }

    @Override
    public void serve() {
        System.out.println("Serving Cheese Burger");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing your cheese burger");
    }
}

package creational.factoryMethod.before;

public class Main {
    public static void main(String[] args) {
        Restuarant restuarant = new Restuarant();
        CheeseBurger cheeseBurger = new CheeseBurger();
        ChickenBurger chickenBurger = new ChickenBurger();
        VeggieBurger veggieBurger = new VeggieBurger();
    }
    /**
     * This way of directly creating concrete objects directly coupled the classes with the client code
     * here - the client need to know the details of the classes
     * - if we want new addition or deletions of new burger type we would have to modify the code which violates open/close principle
     */
}

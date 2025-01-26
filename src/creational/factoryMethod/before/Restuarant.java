package creational.factoryMethod.before;

public class Restuarant {
    public Burger orderBurger(Menu type){
        Burger burger = null;
        switch (type) {
            case CHICKEN -> burger = new ChickenBurger();
            case VEGGIE -> burger = new VeggieBurger();
            case CHEESE -> burger = new CheeseBurger();
            default -> System.out.println("No type matched!");
        }

        burger.prepare();
        burger.serve();
        return null;
    }
    /**
     * We always have to modify this code for every new burger type additions.
     * we have two kinds of codes present in here. One changes and another doesn't.
     * let's separate code that changes from code that doesn't change.
     */
}

package creational.factoryMethod.after;

public class Main {
    public static void main(String[] args) {
        Restuarant restuarant = new Restuarant();
        restuarant.orderBurger(new CheeseBurgerFactory());
        restuarant.orderBurger(new VeggieBurgerFactory());
        restuarant.orderBurger(new ChickenBurgerFactory());
    }
    /**
     * Here, only the factories are used, not the actual product is not used
     * - we able to centralised the creation of objects at a place (centralized creation)
     * - the products are not directly couple, which allow us to even modify the implementation details of the products
     */
}

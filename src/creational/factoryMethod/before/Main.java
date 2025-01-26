package creational.factoryMethod.before;

public class Main {
    public static void main(String[] args) {
        Restuarant restuarant = new Restuarant();

        Burger cheeseBurger = restuarant.orderBurger(Menu.CHEESE);
        System.out.println("got my cheese burger. Its very tasty");

        Burger chickenBurger = restuarant.orderBurger(Menu.CHICKEN);
        System.out.println("got my chicken burger. Its very tasty");

        Burger veggieBurger = restuarant.orderBurger(Menu.VEGGIE);
        System.out.println("got my veggie burger. Its very tasty");

    }
    /**
     * This way of directly creating concrete objects directly coupled the classes with the client code
     * here - the client need to know the details of the classes
     * - if we want new addition or deletions of new burger type we would have to modify the code which violates open/close principle
     */
}

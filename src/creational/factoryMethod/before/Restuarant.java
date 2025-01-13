package creational.factoryMethod.before;

public class Restuarant {
    public Burger orderBurger(String type){
        switch (type) {
            case "chicken" -> {
                return new ChickenBurger();
            }
            case "veggies" -> {
                return new VeggieBurger();
            }
            case "cheese" -> {
                return new CheeseBurger();
            }
        }

        System.out.println("No type matched!");
        return null;
    }
    /**
     * We always have to modify this code for every new burger type additions
     */
}

package creational.factoryMethod.after;

import creational.factoryMethod.before.Burger;

public class Restuarant {
    public Burger orderBurger(BurgerFactory factory){
        return factory.prepareBurger();
    }
}

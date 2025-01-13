package creational.factoryMethod.after;

import creational.factoryMethod.before.Burger;
import creational.factoryMethod.before.CheeseBurger;

public class CheeseBurgerFactory implements BurgerFactory{
    @Override
    public Burger prepareBurger() {
        return new CheeseBurger();
    }
}

package creational.abstractFactoryMethod.before;

import creational.factoryMethod.after.BurgerFactory;
import creational.factoryMethod.before.Burger;

public class CokeFactory implements BurgerFactory {
    @Override
    public Burger prepareBurger() {
        return null;
    }
}

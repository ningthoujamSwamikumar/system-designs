package creational.factoryMethod.after;

import creational.factoryMethod.before.Burger;
import creational.factoryMethod.before.ChickenBurger;

public class ChickenBurgerFactory implements BurgerFactory{
    @Override
    public Burger prepareBurger() {
        return new ChickenBurger();
    }
}

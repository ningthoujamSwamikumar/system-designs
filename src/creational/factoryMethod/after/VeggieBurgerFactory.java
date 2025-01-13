package creational.factoryMethod.after;

import creational.factoryMethod.before.Burger;
import creational.factoryMethod.before.VeggieBurger;

public class VeggieBurgerFactory implements BurgerFactory{
    @Override
    public Burger prepareBurger() {
        return new VeggieBurger();
    }
}

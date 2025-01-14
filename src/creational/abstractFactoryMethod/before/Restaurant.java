package creational.abstractFactoryMethod.before;

import creational.factoryMethod.after.BurgerFactory;
import creational.factoryMethod.before.Burger;

public class Restaurant {
    public Burger orderFood(BurgerFactory factory){
        return factory.prepareBurger();
    }

//    public ? orderJuie(? factory){
//        return factory.prepare();
//    }

    /**
     * here, we cannot use the same burger factory and we need new kind of factory which return the new type i.e. juice
     */
}

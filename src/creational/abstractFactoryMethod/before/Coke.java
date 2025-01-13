package creational.abstractFactoryMethod.before;

public class Coke implements Drinks {
    @Override
    public Drinks prepare() {
        return new Coke();
    }
}

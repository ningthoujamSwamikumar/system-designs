package creational.abstractFactoryMethod.before;

public class Mojito implements Drinks{
    @Override
    public Drinks prepare() {
        return new Mojito();
    }
}

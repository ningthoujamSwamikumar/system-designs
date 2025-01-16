package structural.decorator.components;

public class Expresso implements Coffee{
    @Override
    public int cost() {
        return 10;
    }
}

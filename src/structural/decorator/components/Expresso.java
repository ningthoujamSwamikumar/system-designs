package structural.decorator.components;

public class Expresso implements Coffee{
    @Override
    public int cost() {
        System.out.println("Base cost of expresso: " + 10);
        return 10;
    }
}

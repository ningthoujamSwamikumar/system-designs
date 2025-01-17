package structural.decorator.components;

public class Cappuccino implements Coffee{

    @Override
    public int cost() {
        System.out.println("Base cost of cappuccino: " + 5);
        return 5;
    }
}

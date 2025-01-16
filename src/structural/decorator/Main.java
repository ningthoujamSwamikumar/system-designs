package structural.decorator;

import structural.decorator.components.Cappuccino;
import structural.decorator.components.Coffee;
import structural.decorator.decorators.Biscuit;
import structural.decorator.decorators.Cream;
import structural.decorator.decorators.Sugar;

public class Main {
    public static void main(String[] args) {
        Coffee cappuccino = new Cappuccino();
        cappuccino = new Sugar(cappuccino);
        cappuccino = new Cream(cappuccino);
        cappuccino = new Biscuit(cappuccino);

        int totalCost = cappuccino.cost();
        System.out.println("cost of cappucino after adding up all: Rs " + totalCost);
    }
}

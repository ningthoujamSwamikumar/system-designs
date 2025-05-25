package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.components.Coffee;

public class Sugar implements CoffeeDecorator{

    private Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int extraCharge() {
        return 2;
    }

    @Override
    public int cost() {
        System.out.println("Adding cost of sugar: " + 2);
        return this.coffee.cost() + this.extraCharge();
    }
}

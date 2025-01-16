package structural.decorator.decorators;

import structural.decorator.components.Coffee;

public class Biscuit implements CoffeeDecorator{

    private Coffee coffee;

    public Biscuit(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int extraCharge() {
        return 5;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + this.extraCharge();
    }
}

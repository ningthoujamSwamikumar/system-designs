package structural.decorator.decorators;

import structural.decorator.components.Coffee;

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
        return this.coffee.cost() + this.extraCharge();
    }
}

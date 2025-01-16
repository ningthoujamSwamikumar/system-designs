package structural.decorator.decorators;

import structural.decorator.components.Coffee;

public interface CoffeeDecorator extends Coffee {
    int extraCharge();
}

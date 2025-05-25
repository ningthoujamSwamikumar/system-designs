package designPatterns.structural.decorator.decorators;

import designPatterns.structural.decorator.components.Coffee;

public interface CoffeeDecorator extends Coffee {
    int extraCharge();
}

package DecoratorPattern.Beverages;

import DecoratorPattern.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}

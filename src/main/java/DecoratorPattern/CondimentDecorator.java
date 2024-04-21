package DecoratorPattern;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    @Override
    public abstract String getDescription();
}

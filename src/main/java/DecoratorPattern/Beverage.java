package DecoratorPattern;

import lombok.Getter;

@Getter
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}

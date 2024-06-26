package DecoratorPattern;

import DecoratorPattern.Beverages.DarkRoast;
import DecoratorPattern.Beverages.Expresso;
import DecoratorPattern.Beverages.HouseBlend;
import DecoratorPattern.Condiments.Mocha;
import DecoratorPattern.Condiments.Soy;
import DecoratorPattern.Condiments.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3);
    }
}

package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        Duck rubber = new RubberDuck();
        rubber.performFly();
        rubber.performQuack();
    }
}

package StrategyPattern;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("This is a quack");
    }
}

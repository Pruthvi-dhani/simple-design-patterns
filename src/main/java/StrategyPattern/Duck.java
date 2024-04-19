package StrategyPattern;

public abstract class Duck {

    FlyBehaviour flyBehaviour;

    QuackBehaviour quackBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }
}

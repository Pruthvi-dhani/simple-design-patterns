package StrategyPattern;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("This is a muted quack");
    }
}

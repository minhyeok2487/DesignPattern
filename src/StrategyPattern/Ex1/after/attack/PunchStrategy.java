package StrategyPattern.Ex1.after.attack;

public class PunchStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have Strong punch and can attack with it.");
    }
}

package StrategyPattern.Ex1.after;

import StrategyPattern.Ex1.after.attack.MissileStrategy;
import StrategyPattern.Ex1.after.attack.PunchStrategy;
import StrategyPattern.Ex1.after.moving.FlyingStrategy;
import StrategyPattern.Ex1.after.moving.WalkingStrategy;

public class Client {

    public static void main(String[] args) {
        TaekwonV taekwonV = new TaekwonV("TaekwonV");
        Atom atom = new Atom("Atom");

        // 전략 설정
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());

        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();

        // 이동방식(전략) 변경 -> 기존코드 수정없이 변경이 가능하다.
        atom.setMovingStrategy(new WalkingStrategy());

        // 새로운 로봇 추가 -> 코드 중복없이 이동과 공격전략 설정이 가능하다.
        Sungard sungard = new Sungard("Sungard");
        sungard.setMovingStrategy(new FlyingStrategy());
        sungard.setAttackStrategy(new MissileStrategy());
    }
}

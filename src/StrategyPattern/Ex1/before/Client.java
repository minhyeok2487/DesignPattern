package StrategyPattern.Ex1.before;

public class Client {
    public static void main(String[] args) {

        TaekwonV taekwonV = new TaekwonV("TaekwonV");
        Atom atom = new Atom("Atom");

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}

/*
[문제점]
1. 기존 로봇의 공격 또는 이동 방법을 수정하려면 어떤 변경 작업을 해야 하는가?
예를 들어 아톰이 날 수는 없고 오직 걷게만 만들고 싶다면? 또는 태권V를 날게 하려면?
-> 현재 코드에선 기존 코드의 내용을 수정해야 하므로 OCP에 위배된다.

2. 새로운 로봇을 만들어 기존의 공격 또는 이동 방법을 추가하거나 수정하려면?
예를 들어 새로운 로봇으로 선가드(Sungard 클래스)를 만들어 태권V의 미사일 공격 기능을 추가하려면?
-> 새로운 클래스는 상속으로 쉽지만, 태권V의 미사일 공격 기능을 사용하려고 하면
attack 메서드가 중복해서 사용된다.

[해결책]
무엇이 변화되었는지 찾은 후에 이를 클래스로 캡슐화해야한다.
-> 공격과 이동을 위한 인터페이스를 각각 만들고 이들을 실제 실현한 클래스를 만들어야 한다.
*/

package StrategyPattern.Ex2;

import StrategyPattern.Ex2.pricePolicy.BookDiscountPricePolicy;
import StrategyPattern.Ex2.pricePolicy.MemberDiscountPricePolicy;
import StrategyPattern.Ex2.pricePolicy.OrdinaryPricePolicy;

public class Client {
    public static void main(String[] args) {
        Member member1 = new Member("member1");
        Member member2 = new Member("member2");

        Book book1 = new Book("book1", 2015, 1000);
        Book book2 = new Book("book2", 2014, 1200);
        Book book3 = new Book("book3", 2001, 4300);

        Rental rental1 = new Rental(member1, book2, new OrdinaryPricePolicy(), 2); // 할인 X
        Rental rental2 = new Rental(member2, book1, new OrdinaryPricePolicy(), 3); // 할인 X

        // 10년 이상 된 책이기 때문에 자체 할인이 들어간다
        Rental rental3 = new Rental(member2, book3, new BookDiscountPricePolicy(), 2);

        // 10년 이상 된 책이기 때문에 자체 할인이지만
        // 누적 대여금액이 만원이상이기 때문에 회원 할인이 들어간다.
        Rental rental4 = new Rental(member1, book3, new BookDiscountPricePolicy(), 20);
        System.out.println("rental4.getPricePolicy() = " + rental4.getPricePolicy());

        System.out.println("rental1 = " + rental1.getPrice());
        System.out.println("rental2 = " + rental2.getPrice());
        System.out.println("rental3 = " + rental3.getPrice());
        System.out.println("rental4 = " + rental4.getPrice());
    }
}

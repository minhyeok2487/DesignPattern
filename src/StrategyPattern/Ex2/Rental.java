package StrategyPattern.Ex2;

import StrategyPattern.Ex2.pricePolicy.MemberDiscountPricePolicy;
import StrategyPattern.Ex2.pricePolicy.PricePolicy;

public class Rental {

    private Member member;

    private Book book;

    private PricePolicy pricePolicy; // 가격 정책 참조

    private int n;

    public Rental(Member member, Book book, PricePolicy pricePolicy, int n) {
        this.member = member;
        this.book = book;
        this.n = n;
        this.member.addAccPrice(pricePolicy.calcPrice(book.getPrice(), n));
        this.pricePolicy = pricePolicy; // 가격 정책 주입
        if (this.member.getAccPrice() >= 10000) { // 누적 대여금액 10000원 이상시 회원할인
            this.pricePolicy = new MemberDiscountPricePolicy();
        }
    }

    public int getPrice() {
        return pricePolicy.calcPrice(book.getPrice(), n); // 가격 정책에 따른 책 가격을 계산함
    }

    public PricePolicy getPricePolicy() {
        return pricePolicy;
    }
}

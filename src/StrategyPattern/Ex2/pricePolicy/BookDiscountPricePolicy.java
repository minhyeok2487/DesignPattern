package StrategyPattern.Ex2.pricePolicy;

public class BookDiscountPricePolicy implements PricePolicy {
    // 책 자체 가격 할인 정책
    @Override
    public int calcPrice(int price, int n) {
        return (int)(price * n * 0.95);
    }


}

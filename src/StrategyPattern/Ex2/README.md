### 다음 요구사항을 만족하는 코드를 Strategy 패턴을 사용해 작성하라.

- 회원은 이름과 누적 대여 금액을 갖는다.
- 책은 서명, 출판년도, 가격을 갖는다(재고는 무한대라고 가정)
- 회원은 하나의 책을 1권 이상 살 수 있다.
- 회원이 책을 살 때마다 누적 금액이 저장된다.
- 가격 정책에 따라 책 값이 할인되며 다른 가격 정책이 추가될 수 있다.
- 10년이상 된 책은 책 자체 할인, 누적 대여 금액이 만 원 이상이면 회원 할인, 그 외의 경우에는 할인이 되지 않는다.

---

### 생각
위의 요구사항에서 변하는 것과 변하는 않는 것은 무엇인가?

#### 변하지 않는 것
- 회원의 이름, 누적 대여 금액
- 책의 서명, 출판년도, 가격

#### 변하는 것
- 가격 정책
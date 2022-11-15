package lotto;

import static lotto.constant.Rules.LOTTO_PRICE;

import lotto.exception.MoneyNotDividedByPriceException;
import lotto.exception.MoneyNotPositiveIntegerException;
import lotto.exception.MoneyRangeException;

public class Money {

    private final int money;

    public Money(int money) {
        validate(money);
        this.money = money;
    }

    public Money(String money) {
        validate(money);
        this.money = Integer.parseInt(money);
    }

    private void validate(String money) {
        if (!verifyPositiveInteger(money)) {
            throw new MoneyNotPositiveIntegerException();
        }
        validate(Integer.parseInt(money));
    }

    private void validate(int money) {
        if (!verifyRange(money)) {
            throw new MoneyRangeException();
        }
        if (!verifyDividedByPrice(money)) {
            throw new MoneyNotDividedByPriceException();
        }
    }

    private boolean verifyPositiveInteger(String money) {
        return money != null && money.matches("^[1-9]\\d*");
    }

    private boolean verifyRange(int money) {
        return money >= LOTTO_PRICE;
    }

    private boolean verifyDividedByPrice(int money) {
        return money % LOTTO_PRICE == 0;
    }

    public int calculateLottoCount() {
        return money / LOTTO_PRICE;
    }
}

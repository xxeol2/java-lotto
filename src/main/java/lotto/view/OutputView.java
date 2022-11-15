package lotto.view;

import static lotto.constant.Message.INPUT_BONUS_NUMBER;
import static lotto.constant.Message.INPUT_PURCHASE_MONEY;
import static lotto.constant.Message.INPUT_WINNING_NUMBER;
import static lotto.constant.Message.LOTTO_GENERATED;

import java.util.List;
import lotto.lotto.Lotto;

public class OutputView {

    public static void printInputPurchaseMoney() {
        System.out.println(INPUT_PURCHASE_MONEY);
    }

    public static void printGeneratedLotto(List<Lotto> lottos) {
        System.out.println(String.format(LOTTO_GENERATED, lottos.size()));
        for (Lotto lotto : lottos) {
            System.out.println(lotto);
        }
    }

    public static void printInputWinningNumber() {
        System.out.println(INPUT_WINNING_NUMBER);
    }

    public static void printInputBonusNumber() {
        System.out.println(INPUT_BONUS_NUMBER);
    }
}

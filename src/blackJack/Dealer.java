package blackJack;

import blackJack.interfaces.IDealer;

public class Dealer extends Player implements IDealer {

    public Dealer() {
        super("Крупье");
    }

    @Override
    public boolean isNeedAnotherCard() {
        return countValues() < 17;
    }
}

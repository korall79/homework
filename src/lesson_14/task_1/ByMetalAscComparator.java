package lesson_14.task_1;

import java.util.Comparator;

/***
 * Сортировка монет по металлу по возрастанию
 */
public class ByMetalAscComparator implements Comparator<Coin> {

    @Override
    public int compare(Coin firstCoin, Coin secondCoin) {

        if (!firstCoin.getMetal().equals(secondCoin.getMetal())) {
            return firstCoin.getMetal().compareTo(secondCoin.getMetal());
        }
        if (firstCoin.getNominal() != secondCoin.getNominal()) {
            return firstCoin.getNominal() - secondCoin.getNominal();
        }
        if (firstCoin.getYear() != secondCoin.getYear()) {
            return firstCoin.getYear() - secondCoin.getYear();
        }

        return Double.compare(firstCoin.getDiameter(), secondCoin.getDiameter());


    }
}

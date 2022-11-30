package lesson_14.task_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CoinSortUtils {
    public static void printCoinByMetalAsc(Set<Coin> coins) {
        TreeSet<Coin> sortedCoins = new TreeSet<>(new ByMetalAscComparator());
        sortedCoins.addAll(coins);

        for (Coin coin : sortedCoins) {
            System.out.println(coin);
        }
    }
    public static void printCoinByYearAsc(Set<Coin> coins){
        TreeSet<Coin> sortedCoinsYear = new TreeSet<>(new ByYearAscComparator());
        sortedCoinsYear.addAll(coins);
        for (Coin coin1 : sortedCoinsYear) {
            System.out.println(coin1);
        }
    }

    /***
     * Сортировка монет по металлу по убыванию с помощью ананимного класса
     * @param coins
     */
    public static void printCoinByMetalDesc(Set<Coin> coins) {
        TreeSet<Coin> sortedCoins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin firstCoin, Coin secondCoin) {
                if (!firstCoin.getMetal().equals(secondCoin.getMetal())) {
                    return secondCoin.getMetal().compareTo(firstCoin.getMetal());
                }
                if (firstCoin.getNominal() != secondCoin.getNominal()) {
                    return firstCoin.getNominal() - secondCoin.getNominal();
                }
                if (firstCoin.getYear() != secondCoin.getYear()) {
                    return firstCoin.getYear() - secondCoin.getYear();
                }
                return Double.compare(firstCoin.getDiameter(), secondCoin.getDiameter());
            }
        });
        sortedCoins.addAll(coins);
        for (Coin coin : sortedCoins) {
            System.out.println(coin);

        }
    }

    /**
     * Сортировка монет по году по убыванию с помощью ананимного класса
     * @param coins
     */
    public static void PrintCoinByYearDesk(Set<Coin> coins){
        TreeSet<Coin>sortedCoinsYear = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin firstCoin, Coin secondCoin) {
                if (firstCoin.getYear() != secondCoin.getYear()) {
                    return secondCoin.getYear() - firstCoin.getYear();
                }
                if (!firstCoin.getMetal().equals(secondCoin.getMetal())) {
                    return firstCoin.getMetal().compareTo(secondCoin.getMetal());
                }
                if (firstCoin.getNominal() != secondCoin.getNominal()) {
                    return firstCoin.getNominal() - secondCoin.getNominal();
                }
                return Double.compare(firstCoin.getDiameter(), secondCoin.getDiameter());

            }
        });
        sortedCoinsYear.addAll(coins);
        for (Coin coin1 : sortedCoinsYear) {
            System.out.println(coin1);
        }
    }
}

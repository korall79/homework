package lesson_14.task_1;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Coin coin1 = new Coin(10,1921,15,"золото");
        Coin coin2 = new Coin(15,1982,30,"серебро");
        Coin coin3 = new Coin(20,1956,30,"бронза");
        Coin coin4 = new Coin(25,1991,15,"медь");
        Coin coin5 = new Coin(25,1990,15,"олово");

        Set<Coin> coins = new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for (Coin coin:coins) {
            System.out.println(coin);

        }

        System.out.println();
        System.out.println("Сортировка по металлу по возрастанию");
        CoinSortUtils.printCoinByMetalAsc(coins);

        System.out.println();
        System.out.println("Сортировка по металлу по убыванию");
        CoinSortUtils.printCoinByMetalDesc(coins);

        System.out.println();
        System.out.println("Сортировка по году по возрастанию");
        CoinSortUtils.printCoinByYearAsc(coins);

        System.out.println();
        System.out.println("Сортировка по году по возрастанию");
        CoinSortUtils.PrintCoinByYearDesk(coins);
    }
}

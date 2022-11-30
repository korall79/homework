package lesson_14.task_1;

import java.util.Objects;

public class Coin implements Comparable<Coin> {

    private int nominal;
    private int year;
    private  double diameter;
    private String metal;

    public Coin(int nominal, int year, double diameter, String metal) {
        this.nominal = nominal;
        this.year = year;
        this.diameter = diameter;
        this.metal = metal;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public String toString() {
        return String.format("Монета: номинал - %d, год - %d, диаметр - 2%f, металл - %s", nominal,year,diameter,metal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(coin.diameter, diameter) == 0 && Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, year, diameter, metal);
    }

    /***
     * Сравнивает по очереди все показатели монет
     * @param secondCoin the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Coin secondCoin) {
        if (this.getNominal()!= secondCoin.getNominal()){
            return this.getNominal()-secondCoin.getNominal();
        }
        if (this.getYear()!=secondCoin.getYear()){
            return this.getYear()-secondCoin.getYear();
        }
        if (Double.compare(this.getDiameter(),secondCoin.getDiameter())!=0){
            return Double.compare(this.getDiameter(), secondCoin.getDiameter());
        }

        return this.getMetal().compareTo(secondCoin.getMetal());
    }
}

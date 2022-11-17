package lesson__11.task_2;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(5,12);
        Fraction fraction2 = new Fraction(7,12);


        FractionCalc fractionCalc = new FractionCalc();
        System.out.println(fractionCalc.sum(fraction1,fraction2));
      //  System.out.println(fractionCalc.sub(fraction1,fraction2));
    }
}

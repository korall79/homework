package lesson__11.task_2;

public class FractionCalc implements IFractionCalc, IFraction {


    @Override
    public Fraction sum(Fraction fraction1, Fraction fraction2) {

        //   int sumDenominator = Fraction.Math.nok(fraction1.getDenominator(), fraction2.getDenominator());

//        int sumNumerator = fraction1.getNumerator()*(sumDenominator/ fraction1.getDenominator()+
//                fraction2.getNumerator()* (sumDenominator / fraction2.getDenominator()));
        int sumDenominator = fraction1.getDenominator() * fraction2.getDenominator();
        int sumNumerator = fraction1.getNumerator() * fraction2.getDenominator() + fraction1.getDenominator() * fraction2.getNumerator();

        Fraction sum = new Fraction(sumNumerator, sumDenominator);

        if (sumDenominator == sumNumerator) {
            sumNumerator = 1;
            sumDenominator=1;
        } else {

           if (sumNumerator%2==0){
              int a= sumNumerator%2;
           }
        }return sum;
    }

    @Override
    public Fraction sub(Fraction fraction1, Fraction fraction2) {

        int subDenominator = Fraction.Math.nok(fraction1.getDenominator(), fraction2.getDenominator());
        int subNumerator = fraction1.getNumerator() - fraction2.getNumerator();

        Fraction sub = new Fraction(subNumerator, subDenominator);


        return sub;
    }

    @Override
    public Fraction mul(Fraction fraction1, Fraction fraction2) {
        return null;
    }

    @Override
    public Fraction div(Fraction fraction1, Fraction fraction2) {
        return null;
    }

    @Override
    public void setNumerator(int value) {

    }

    @Override
    public void setDenominator(int value) {

    }

    @Override
    public int getNumerator() {
        return getNumerator();
    }

    @Override
    public int getDenominator() {
        return getDenominator();
    }

    @Override
    public double getValueOfFraction() {
        return getValueOfFraction();
    }


}

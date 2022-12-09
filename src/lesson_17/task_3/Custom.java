package lesson_17.task_3;

public class Custom implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {

        double result = Double.parseDouble(number1) / Double.parseDouble(number2);
        System.out.println(result);
        return result;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        int count = 0;
        int index = text.indexOf("word");
        while (index != -1) {
            System.out.println(index);
            index = text.indexOf("word", index + 1);
        }
        return new int[count];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {

        String[] texts = null;
        for (String s : texts) {
            s = s.replaceAll("[a-zA-Z]", "");
            double iso_num = Double.parseDouble(s);
            System.out.println(iso_num);
            if (text.equals(iso_num)==false){
                throw new CustomException("Not found");
            }
        }
        return new double[Integer.parseInt(text)];
    }
}

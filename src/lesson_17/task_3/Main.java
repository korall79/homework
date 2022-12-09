package lesson_17.task_3;

public class Main {
    public static void main(String[] args) throws CustomException {
        Custom custom = new Custom();
//        try {
//            custom.div("1","2.0");
//        }catch (NullPointerException e){
//            System.out.println("number1 или number2 не должны быть равны null");
//        }catch (NumberFormatException e){
//            System.out.println("number1 или number2 должны быть числами");
//        }catch (ArithmeticException e){
//            System.out.println("number2  не должен быть равен нулю");
//        }

//        try {
//            custom.findWord("word window word word word", "word");
//        } catch (NullPointerException e){
//            System.out.println("текст не должен быть null");
//        }

        try {
            custom.findNumbers("текст текст ");
        } catch (CustomException e) {
            System.out.println("в тексте должны быть числа");
        }

    }
}

package lesson_6.task_5;

public class Main {

    public static void main(String[] args) {

        //Написать метод, который возвращает количетсво слов в переданной строке

        System.out.println(getWordsCount("Привет! Я изучаю Java."));


    }
    private static int getWordsCount(String text){
//        String [] words = text.split(" "); // Этот код можно упростить в одну строку
//        int count = words.length;
//        return count;

        return text.split(" ").length;

    }
}

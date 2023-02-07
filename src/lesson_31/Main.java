package lesson_31;

public class Main {
    public static void main(String[] args) {
        Test englishTest = new Test("Тест:Определить уровень Английского языка");

        Question question1 = new Question("I __________ a teacher.", 3);

        Option option11 = new Option("am", true);
        Option option12 = new Option("are", false);
        Option option13 = new Option("be", false);
        Option option14 = new Option("is", false);

        question1.addOptions(option11, option12, option13, option14);

        Question question2 = new Question("_________ you play chess?", 4);

        Option option21 = new Option("are", false);
        Option option22 = new Option("know", false);
        Option option23 = new Option("can", true);
        Option option24 = new Option("have", false);

        question2.addOptions(option21, option22, option23, option24);


        Question question3 = new Question("There isn't __________ fruit in the shop.", 5);

        Option option31 = new Option("some", false);
        Option option32 = new Option("any", true);
        Option option33 = new Option("the", false);
        Option option34 = new Option("two", false);

        question3.addOptions(option31, option32, option33, option34);

        englishTest.addQuestions(question1, question2, question3);

        englishTest.doTest();
    }

}

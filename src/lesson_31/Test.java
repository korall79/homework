package lesson_31;

import com.google.common.math.Quantiles;

import java.util.*;

public class Test {

    private String name;
    private final List<Question> questions = new ArrayList<>();

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(name, test.name) && Objects.equals(questions, test.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, questions);
    }

    @Override
    public String toString() {
        return name;
    }

    public void addQuestions(Question... questionArray) {
        questions.addAll(Arrays.asList(questionArray));
    }

    public void doTest() {
        System.out.println(name);

        for (Question question : questions) {
            System.out.println(question);

            int answer = getOptionNumber(question);

            question.getOptions().get(answer -1).setSelected(true);
        }
        printResult();

    }

    private void printResult(){
        // Поздравляем тест пройдет
        //Тест не пройден

        int userScore = getUserScore();
        int maxScore = getMaxScore();

        if (userScore >= maxScore * 0.75){
            System.out.println("Поздравляем! Тест пройден! ");
        }else {
            System.out.println("Тест не пройден!");
        }
        System.out.printf("У вас %d баллов из % d возможных", userScore,maxScore);
    }

    private int getUserScore(){
        int result = 0;
        for (Question question : questions) {
            for (Option option : question.getOptions()) {
                if (option.isCorrect() && option.isSelected()){
                    result += question.getScore();
                }
            }
        }
        return result;
    }

    private int getMaxScore(){
        int result = 0;
        for (Question question : questions) {
            result += question.getScore();
        }
            return  result;
        }


    private int getOptionNumber(Question question) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите вариант ответа.");
            String answer = scanner.nextLine();
            int result;

            try {
                result = Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("Ввод не корректон. Пожалуйста, введите корректное число");
                continue;
            }
            return result;
            }
        }
    }


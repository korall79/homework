package lesson_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Question {
    private final String question;//вопрос
    private final int score;
    private final List<Option> options = new ArrayList<>();

    public Question(String question, int score) {
        this.question = question;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

      public List<Option> getOptions() {
        return options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return score == question1.score && Objects.equals(question, question1.question) && Objects.equals(options, question1.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, score, options);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(question + "\n");
        for (int i = 0; i < options.size(); i++) {
            result.append(i + 1).append(". ").append(options.get(i).toString()).append("\n");
        }

        return result.toString();
    }
    public void addOptions (Option... optionsArray){
        List<Option>optionsList =Arrays.asList(optionsArray);
            this.options.addAll(optionsList);
    }
}

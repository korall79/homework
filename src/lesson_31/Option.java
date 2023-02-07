package lesson_31;

import java.util.Objects;

public class Option {
    private final String option;
    private final boolean isCorrect;
    private boolean isSelected;

    public Option(String option, boolean isCorrect) {
        this.option = option;
        this.isCorrect = isCorrect;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Option option1 = (Option) o;
        return isCorrect == option1.isCorrect && isSelected == option1.isSelected && Objects.equals(option, option1.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(option, isCorrect, isSelected);
    }

    @Override
    public String toString() {
        return  option;

    }
}

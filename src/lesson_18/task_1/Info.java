package lesson_18.task_1;

public class Info <T>{

    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Info() {
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void printValue(){
        System.out.println(value);
    }
}

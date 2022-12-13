package lesson_18.task_4;

import java.util.List;

public class Info<T>{

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

    public void printElements(List<?> list){
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public double sum(List<? extends Number> list){
        double sum = 0;
        for (Number number : list) {
            sum+=number.doubleValue();
        }
        return sum;
    }
}

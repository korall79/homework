package lesson_20.task_4;

public class Filter implements IFilter{
    @Override
    public boolean test(Student student) {
        return student.getAvarageRate()>25;
    }
}

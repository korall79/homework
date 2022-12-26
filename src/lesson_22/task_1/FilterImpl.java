package lesson_22.task_1;

public class FilterImpl implements Filter{
    @Override
    public boolean test(Student student) {
        return student.getCours()>2;
    }
}

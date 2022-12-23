package lesson_20.task_4;

public class Filter implements IFilter{

    @Override
    public boolean test(Student student) {
        return student.getAge()>25;
    }

    public boolean test1(Student student){
        return student.getCourse()==2;
    }

}

package lesson_18.task_3;

import java.util.List;

public class Print {

    public <T> T getFirstElement(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}

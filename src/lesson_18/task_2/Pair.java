package lesson_18.task_2;

public class Pair<V,K> {

    private V value1;
    private K value2;

    public Pair(V value1, K value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void printValues(){
        System.out.println(value1);
        System.out.println(value2);
    }
}

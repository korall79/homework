package lesson_23.homeworkAndrey;

public class ArrayProcessor implements Runnable {

    private float[] array;
    private int correction;

    public ArrayProcessor(float[] array, int correction) {
        this.array = array;
        this.correction = correction;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + (i + correction) / 5) *
                    Math.cos(0.2f + (i + correction) / 5) * Math.cos(0.4f + (i + correction) / 2));
        }
    }
}

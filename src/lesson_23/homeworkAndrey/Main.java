package lesson_23.homeworkAndrey;

import java.util.Arrays;

public class Main {

    private static int size = 10_000_000;
    private static int half = size / 2;
    private static int check = 5_678_432;
    private static float[] array = new float[size];
    private static int divider = 5;

    public static void main(String[] args) {

        simpleProcessing();
        threadProcessing();
        multipleThreadProcessing();
    }

    private static void multipleThreadProcessing() {

        arrayInit();

        long timer = System.currentTimeMillis();

        int massiveSize = size / divider;

        float[][] multArrays = new float[divider][];
        ArrayProcessor[] arrayProcessors = new ArrayProcessor[divider];
        Thread[] threads = new Thread[divider];

        for (int i = 0; i < multArrays.length; i++) {
            multArrays[i] = new float[massiveSize];
            System.arraycopy(array, massiveSize * i, multArrays[i], 0, massiveSize);
            arrayProcessors[i] = new ArrayProcessor(multArrays[i], massiveSize * i);
            threads[i] = new Thread(arrayProcessors[i]);
            threads[i].start();
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < multArrays.length; i++) {
            System.arraycopy(multArrays[i], 0, array, massiveSize * i, massiveSize);
        }

        System.out.println("????? ?????????? ? ????????? ??????? - " + (System.currentTimeMillis() - timer) + " ???????????");
        System.out.println("??????????? ???????? - " + array[check]);
    }

    private static void threadProcessing() {

        arrayInit();

        long timer = System.currentTimeMillis();

        float[] array1 = new float[half];
        float[] array2 = new float[half];

        System.arraycopy(array, 0, array1, 0, half);
        System.arraycopy(array, half, array2, 0, half);

        ArrayProcessor arrayProcessor1 = new ArrayProcessor(array1, 0);
        ArrayProcessor arrayProcessor2 = new ArrayProcessor(array2, half);

        Thread thread1 = new Thread(arrayProcessor1);
        Thread thread2 = new Thread(arrayProcessor2);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(array1, 0, array, 0, half);
        System.arraycopy(array2, 0, array, half, half);

        System.out.println("????? ?????????? ? 2 ?????? - " + (System.currentTimeMillis() - timer) + " ???????????");
        System.out.println("??????????? ???????? - " + array[check]);
    }

    private static void simpleProcessing() {

        arrayInit();

        long timer = System.currentTimeMillis();

        ArrayProcessor arrayProcessor = new ArrayProcessor(array, 0);
        arrayProcessor.run();

        System.out.println("????? ?????????? ? 1 ????? - " + (System.currentTimeMillis() - timer) + " ???????????");
        System.out.println("??????????? ???????? - " + array[check]);
    }

    private static void arrayInit() {
        Arrays.fill(array, 1);
    }
}

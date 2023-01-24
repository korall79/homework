package lesson_23.homework;

public class OneMassive extends Thread{

    static final int size = 10;
    static final int h = size / 2;
    float[] arr = new float[size];

    @Override
    public void run(){

        for (int i = 0; i < size; i++) {
            arr[i]=1;
            System.out.println(arr[i] + " ");
        }

        long a = System.currentTimeMillis();
    //    System.out.println("Массив заполнен еденицами за " + a  + " миллисекунд");


        for (int i = 0; i < size; i++) {
            arr[i]=(float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            System.out.println(arr[i] + " ");
        }
        System.currentTimeMillis();
     //   System.out.print("Массив заполнен поформуле за " + a  + " миллисекунд");
        System.out.println(System.currentTimeMillis() - a);
    }

}

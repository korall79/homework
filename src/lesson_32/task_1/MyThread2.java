package lesson_32.task_1;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 10000; i <10010 ; i++) {
            try{
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

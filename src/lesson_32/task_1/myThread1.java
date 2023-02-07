package lesson_32.task_1;

public class myThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 100; i < 110; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

}

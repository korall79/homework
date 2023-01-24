package lesson_23.task_1;

public class MeThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 10000; i <10010 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Второй поток завершил работу "+ Thread.currentThread().getName());
    }
}

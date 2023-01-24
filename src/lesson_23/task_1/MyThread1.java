package lesson_23.task_1;

public class MyThread1 extends Thread{
    @Override
    public void run(){
        for (int i = 100; i <110 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Первый поток завершил работу "+ Thread.currentThread().getName());
    }
}

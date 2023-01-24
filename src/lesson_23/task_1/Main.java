package lesson_23.task_1;

public class Main {
    public static void main(String[] args) {
        //способы создания потоков:
        //1. Унаследоваться от класса Thread
        //2. Реализовать интерфейс Runnable

        MyThread1 myThread1 = new MyThread1();//1. Унаследоваться от класса Thread
        myThread1.setDaemon(true);
        myThread1.start();

        Thread myThread2 = new Thread(new MeThread2());//2.Runnable
        myThread2.start();

        for (int i = 0; i < 9; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Главный поток завершил работу "+ Thread.currentThread().getName());
    }
}

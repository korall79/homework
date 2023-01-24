package lesson_23.task_2;

public class Singer2 implements Runnable {
    @Override
    public void run() {
        while (true) {

            synchronized (Monitors.MICROPHONE) {
                try {
                    Monitors.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 4; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("------------------");
            }

            synchronized (Monitors.MICROPHONE) {
                Monitors.MICROPHONE.notify();
            }
        }
    }
}

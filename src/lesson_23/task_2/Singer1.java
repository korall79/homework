package lesson_23.task_2;

public class Singer1 implements Runnable {

    private boolean isStopped = false;
    private int counter = 0;

    @Override
    public void run() {
        while (!isStopped) {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("******************");
            }

            counter++;

            synchronized (Monitors.MICROPHONE){
                Monitors.MICROPHONE.notify();
            }

            if (counter>=3){
                isStopped=true;
                continue;
            }

            synchronized (Monitors.MICROPHONE){
                try {
                    Monitors.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

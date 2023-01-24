package lesson_23.task_2;

public class Host {
    public static void main(String[] args) {
        System.out.println("Начало концерта");

        Thread singer1 = new Thread(new Singer1());
        Thread singer2 = new Thread(new Singer2());
        singer2.setDaemon(true);
        singer1.start();
        singer2.start();

        try {
            singer1.join();
     //       singer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Концерт окончен");
    }
}

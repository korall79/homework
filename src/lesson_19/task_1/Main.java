package lesson_19.task_1;

public class Main {
    public static void main(String[] args) {
//        ICopyUtils copyUtilsIO = new CopyWithIO();
//        long Start = System.currentTimeMillis();
//        copyUtilsIO.copy("C:\\Users\\User\\Desktop.mp4", "copy\\IO.mp4");
//        long end = System.currentTimeMillis();
//        System.out.println(end-Start);


//        ICopyUtils copyWithNIO = new CopyWithIO();
//        long Start = System.currentTimeMillis();
//        copyWithNIO.copy("C:\\Users\\User\\Desktop.mp4", "copy\\IO.mp4");
//        long end = System.currentTimeMillis();
//        System.out.println(end-Start);

        ICopyUtils copyWithAppache = new CopyWithIO();
        long Start = System.currentTimeMillis();
        copyWithAppache.copy("C:\\Users\\User\\Desktop.mp4", "copy\\Appache.mp4");
        long end = System.currentTimeMillis();
        System.out.println(end-Start);
    }
}

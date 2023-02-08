package lesson_21.task_1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {

//        File file = new File("test\\lesson\\test.txt");
//        System.out.println(file.exists());
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(file.exists());

//        File dir = new File("test\\lesson\\file");
//        dir.mkdir();//создает одну папку

        File dir = new File("test\\lesson\\file\\test\\lesson\\file");
        dir.mkdirs();// создает несколько папок
    }
}

package lesson_19.task_1;
//
//import org.apache.commons.io.FileUtils;
//
//import java.io.File;
//import java.io.IOException;

//public class CopyWithApache implements ICopyUtils{
//    @Override
//    public void copy(String from, String to) {
//        File fileFrom = new File(from);
//        File fileTo = new File(to);
//        try {
//            FileUtils.copyFile(fileFrom,fileTo);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

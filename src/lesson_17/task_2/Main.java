package lesson_17.task_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        try{
            person.setAge(151);
        }catch (TooYoungException e){
            System.out.println("Внутри юлока catch");
            e.printStackTrace();
        }catch (TooOldException e){
            System.out.println("Внутри блока catch");
        }finally {
            System.out.println("Этот блок finally");
        }
        System.out.println("После блока catch");
    }

}

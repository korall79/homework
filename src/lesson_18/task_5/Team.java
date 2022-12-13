package lesson_18.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{

    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addParticipant(T participant){
        participants.add(participant);
    }

    public void printWinner(Team<T> team){
        Random random = new Random();
       int randomInt= random.nextInt(2);
       if (randomInt==0){
           System.out.println("Победители - "+ getName());
       }else {
           System.out.println("Победители - "+team.getName());
       }
    }
}

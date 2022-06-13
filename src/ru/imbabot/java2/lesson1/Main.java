package ru.imbabot.java2.lesson1;

import ru.imbabot.java2.lesson1.Obstacles.Obstacle;
import ru.imbabot.java2.lesson1.Obstacles.Treadmill;
import ru.imbabot.java2.lesson1.Obstacles.Wall;
import ru.imbabot.java2.lesson1.Participants.Cat;
import ru.imbabot.java2.lesson1.Participants.Human;
import ru.imbabot.java2.lesson1.Participants.Participant;
import ru.imbabot.java2.lesson1.Participants.Robot;

public class Main {

    public static void main(String[] args) {
        Participant[] participants = new Participant[3];
        participants[0] = new Cat();
        participants[1] = new Human();
        participants[2] = new Robot();


        Obstacle[] obstacles = new Obstacle[3];
        obstacles[0] = new Treadmill();
        obstacles[1] = new Wall();
        obstacles[2] = new Treadmill();

        for (Obstacle o: obstacles){
            for (Participant p: participants){
                o.doIt(p);
            }
        }
    }
}

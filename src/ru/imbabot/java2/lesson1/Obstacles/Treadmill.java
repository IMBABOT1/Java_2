package ru.imbabot.java2.lesson1.Obstacles;

import ru.imbabot.java2.lesson1.Participants.Participant;

public class Treadmill implements Obstacle{

    private int length;

    public Treadmill(){
        this.length = 200;
    }

    @Override
    public void doIt(Participant p) {
       p.run(length);
    }
}

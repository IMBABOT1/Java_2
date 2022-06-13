package ru.imbabot.java2.lesson1.Obstacles;

import ru.imbabot.java2.lesson1.Participants.Participant;

public class Wall implements Obstacle{

    private int height;

    public Wall(){
        this.height = 12;
    }


    @Override
    public void doIt(Participant p) {
        p.jump(height);
    }
}

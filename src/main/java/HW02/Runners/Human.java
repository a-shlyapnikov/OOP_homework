package HW02.Runners;

import HW02.Obstacle.Obstacle;

public class Human extends Creature {
    private static int count;


    public Human(String creatureName, int maxJumpHeight, int maxRunDistance) {
        super("Человек", creatureName, maxJumpHeight, maxRunDistance);
    }

    public Human(int maxJumpHeight, int maxRunDistance) {
        this(String.format("Human#%d", ++count), maxJumpHeight, maxRunDistance);
    }
}

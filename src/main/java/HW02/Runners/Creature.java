package HW02.Runners;

import HW02.Obstacle.Obstacle;
import HW02.Obstacle.Track;
import HW02.Obstacle.Wall;

public abstract class Creature implements Athlete {
    private String creatureType;
    private String creatureName;
    private int maxJumpHeight;
    private int maxRunDistance;
    private boolean inGame;


    public Creature(String creatureType, String creatureName, int maxJumpHeight, int maxRunDistance) {
        this.creatureType = creatureType;
        this.creatureName = creatureName;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
        this.inGame = true;
    }

    @Override
    public void run(Track track) {
        if (maxRunDistance > track.getObstacleValue()) {
            System.out.printf("%s пробежал %d метров", creatureName, track.getObstacleValue());
        } else {
            System.out.printf("%s не смог пробежать %d м", creatureName, track.getObstacleValue());
            inGame = false;
        }
    }

    @Override
    public void jump(Wall wall) {
        if (maxJumpHeight > wall.getObstacleValue()) {
            System.out.printf("%s c максимальной высотой прыжка %d " +
                            "перепрыгнул стену высотой  %d м\n",
                            creatureName, maxJumpHeight,
                            wall.getObstacleValue());
        } else {
            System.out.printf("%s c максимальной высотой прыжка %d " +
                            "не смог перепрыгнуть стену высотой %d м\n",
                            creatureName, maxJumpHeight,
                            wall.getObstacleValue());
            inGame = false;
        }
    }

    public void handleObstacle(Obstacle obstacle) {
        if (obstacle.getClass().equals(Wall.class)) {
            jump((Wall) obstacle);
        } else {
            run((Track) obstacle);
        }
    }

    @Override
    public void endRace() {
        System.out.printf("%s финишировал!\n", creatureName);
    }

    public String getCreatureName() {
        return creatureName;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public boolean getInGame() {
        return inGame;
    }


}

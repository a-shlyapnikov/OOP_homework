package HW02.Runners;

public class Robot extends Creature{
    private static int count;
    public Robot(String creatureName, int maxJumpHeight, int maxRunDistance) {
        super("Робот", creatureName, maxJumpHeight, maxRunDistance);
    }

    public Robot(int maxJumpHeight, int maxRunDistance) {
        this(String.format("Robot#%d", ++count), maxJumpHeight, maxRunDistance);
    }

    @Override
    public void endRace() {
        System.out.printf("Weow-weow, %s финишировал\n", getCreatureName());
    }
}

package HW02.Runners;

public class Cat extends Creature{
    private static int count;
    public Cat(String creatureName, int maxJumpHeight, int maxRunDistance) {
        super("Кот", creatureName, maxJumpHeight, maxRunDistance);
    }

    public Cat(int maxJumpHeight, int maxRunDistance) {
        this(String.format("Cat#%d", ++count), maxJumpHeight, maxRunDistance);
    }

    @Override
    public void endRace() {
        System.out.printf("Meow, %s финишировал\n", getCreatureName());
    }
}

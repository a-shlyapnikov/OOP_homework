package HW02.Obstacle;

public class Wall extends Obstacle{
    private static int count;

    public Wall(int obstacleValue, String obstacleName) {
        super(obstacleValue, obstacleName);
    }

    public Wall(int obstacleValue) {
        this(obstacleValue, String.format("Wall#%d", ++count));
    }


}

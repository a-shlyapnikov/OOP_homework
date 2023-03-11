package HW02.Obstacle;

public class Track extends Obstacle {
    private static int count;
    public Track(int obstacleValue, String obstacleName) {
        super(obstacleValue, obstacleName);
    }

    public Track(int obstacleValue) {
        this(obstacleValue, String.format("Track#%d", ++count));
    }


}

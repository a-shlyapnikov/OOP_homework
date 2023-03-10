package HW02.Obstacle;

public abstract class Obstacle {
    protected int obstacleValue;
    protected String obstacleName;

    public Obstacle(int obstacleValue, String obstacleName) {
        this.obstacleValue = obstacleValue;
        this.obstacleName = obstacleName;
    }


    public int getObstacleValue() {
        return obstacleValue;
    }

    public String getObstacleName() {
        return obstacleName;
    }
}

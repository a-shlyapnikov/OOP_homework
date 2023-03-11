package HW02.Runners;

import HW02.Obstacle.Track;
import HW02.Obstacle.Wall;

public interface Athlete {

    void run(Track track);

    void jump(Wall wall);
    void endRace();
}

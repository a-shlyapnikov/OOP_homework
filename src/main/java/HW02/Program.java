package HW02;

import HW02.Obstacle.Obstacle;
import HW02.Obstacle.Track;
import HW02.Obstacle.Wall;
import HW02.Runners.Cat;
import HW02.Runners.Creature;
import HW02.Runners.Human;
import HW02.Runners.Robot;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static Random rnd = new Random();

    public static void main(String[] args) {
        ArrayList<Creature> racers = new ArrayList<>(10);
        int size = 10;
        fillArrayRacers(racers, size);
        ArrayList<Obstacle> obstacles = new ArrayList<>(10);
        fillArrayObstacles(obstacles, size);
        race(racers, obstacles);
        showFinished(racers);


    }

    public static void showFinished(ArrayList<Creature> racers) {
        System.out.println("Финишировавшие: ");
        for (Creature racer : racers) {
            if (racer.getInGame()){
                racer.endRace();
            }
        }
    }

    public static void race(ArrayList<Creature> racers, ArrayList<Obstacle> obstacles) {
        System.out.println("Гонка началась!");
        for (Creature racer : racers) {
            for (Obstacle obstacle : obstacles) {
                System.out.printf("Препятствие: %s, со значением %d\n",
                                    obstacle.getObstacleName(),
                                    obstacle.getObstacleValue());
                racer.handleObstacle(obstacle);
                if (!racer.getInGame()) {
                    System.out.println(racer.getCreatureName() + " сошел с дистанции...");
                    break;
                }
            }
        }
    }

    public static void fillArrayObstacles(ArrayList<Obstacle> obstacles, int size) {
        for (int i = 0; i < size; i++) {
            int r = rnd.nextInt(0, 1);
            if (r == 0) {
                obstacles.add(new Wall(rnd.nextInt(1, 4)));
            } else {
                obstacles.add(new Track(rnd.nextInt(50, 800)));
            }
        }
    }

    public static void fillArrayRacers(ArrayList<Creature> racers, int size) {
        for (int i = 0; i < size; i++) {
            int r = rnd.nextInt(0, 2);
            switch (r) {
                case 0:
                    racers.add(new Cat(rnd.nextInt(1, 2), rnd.nextInt(100, 300)));
                    racers.add(new Human(rnd.nextInt(1, 5), rnd.nextInt(400, 700)));
                    break;
                case 1:
                    racers.add(new Robot(rnd.nextInt(1, 4), rnd.nextInt(500, 800)));
                    break;
                case 2:
                    break;
                default:
                    racers.add(new Human(rnd.nextInt(1, 4), rnd.nextInt(400, 800)));
                    break;
            }
        }
    }

}

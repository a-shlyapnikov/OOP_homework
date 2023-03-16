package HW03;


import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Game game = null;
        game = chooseGame(game);
        int sizeWord = 4;
        int maxTry = 10;
        game.start(sizeWord, maxTry);
        playGame(game);
        getLog(game);
    }

    private static void playGame(Game game) {
        while (game.getGameStatus().equals(GameStatus.START)) {
            System.out.print("Ход игрока -> ");
            String answer = scanner.next();
            Answer answerGame = game.inputAnswer(answer);
            System.out.println(String.format("Найдено %d коров и %d быков",
                    answerGame.getCows(),
                    answerGame.getBull()));
        }

        if (game.getGameStatus().equals(game.getGameWin())) {
            System.out.println("Игрок выйграл!");
            System.out.println("Загаданное слово - " + game.getWord());
        } else {
            System.out.println("Игрок проиграл(");
            System.out.println("Загаданное слово - " + game.getWord());
        }
    }

    public static void getLog(Game game) {
        System.out.print("Вывести историю ходов (1 - да, 2- нет) -> ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println(game.getHistory());
        } else if (choice == 2) {
            System.out.println("Историю не вывожу");
        } else {
            System.out.println("Ответ не ясен...");
        }
    }

    public static Game chooseGame(Game game) {
        int choice = 0;
        System.out.println("1 - Игра с цифрами");
        System.out.println("2 - Игра с буквами EN");
        System.out.println("3 - Игра с буквами RU");
        System.out.println("4 - Выход");
        System.out.print("Выберите пункт меню -> ");
//        do {

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    game = new NumberGame();
                    break;
                case 2:
                    game = new WordGameEng();
                    break;
                case 3:
                    game = new WordGameRu();
                    break;
                case 4:
                    System.out.println("Выход...");
                    System.exit(0);
                default:
                    System.out.println("Такой игры еще нет");
            }
//        } while ( choice >= 0 || choice <= 4);
        return game;
    }
}


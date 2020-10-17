import Entity.ComputerPlayer;
import Entity.HumanPlayer;
import Entity.Player;
import Services.SimplePrintService;

public class Game {
    public static int countMatches = 20;
    public static Player currentPlayer;

    public static void main(String[] args) {
        SimplePrintService gamePrintService = new SimplePrintService();
        ComputerPlayer computerPlayer = new ComputerPlayer();
        System.out.println("Начало игры.");
        HumanPlayer humanPlayer = new HumanPlayer();

        while (countMatches != 1) {
            gamePrintService.printCountMatches(countMatches);
            currentPlayer = computerPlayer;
            countMatches = computerPlayer.move(countMatches);
            if (countMatches == 1) {
                break;
            }
            gamePrintService.printCountMatches(countMatches);
            currentPlayer = humanPlayer;
            countMatches = humanPlayer.move(countMatches);
        }
        gamePrintService.printWinner(currentPlayer);
    }
}

package Services;

import Entity.Player;

public interface PrintService {
    void printCountMatches(int countMatches);
    void printCurrentPlayer(Player player);
    void printInvalidMoveHumanPlayer();
    void printWinner(Player player);
}

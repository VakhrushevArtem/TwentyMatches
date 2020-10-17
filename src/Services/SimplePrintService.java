package Services;

import Entity.ComputerPlayer;
import Entity.HumanPlayer;
import Entity.Player;

public class SimplePrintService implements PrintService {
    @Override
    public void printCountMatches(int countMatches) {
        System.out.printf("На столе осталось %d спичек.", countMatches);
        System.out.println();
    }

    @Override
    public void printCurrentPlayer(Player player) {
        if (player instanceof HumanPlayer) {
            System.out.print(" - Ход игрока по имени " + ((HumanPlayer) player).getName() + ". Введите количество спичек(от 1 до 3): ");
        } else if (player instanceof ComputerPlayer) {
            System.out.printf(" - Ход компьютера. Количество выбранных компьютером спичек = %d.", ((ComputerPlayer) player).getRemovedMatches());
            System.out.println();
        }
    }

    @Override
    public void printInvalidMoveHumanPlayer() {
        System.out.println("Некорректное количество спичек.");
    }

    @Override
    public void printWinner(Player player) {
        System.out.printf("На столе осталась последняя спичка. Выиграл %s.", player.getName());
    }
}

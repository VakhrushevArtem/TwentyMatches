package Entity;

import Services.SimplePrintService;

public class ComputerPlayer implements Player {
    private String name = "Компьютер";
    private int removedMatches;
    private SimplePrintService computerPrintService = new SimplePrintService();

    public int getRemovedMatches() {
        return removedMatches;
    }

    @Override
    public int move(int countMatches) {
        if (countMatches % 4 == 0) {
            removedMatches = 3;
            computerPrintService.printCurrentPlayer(this);
            return countMatches - removedMatches;
        } else if ((countMatches + 1) % 4 == 0) {
            removedMatches = 2;
            computerPrintService.printCurrentPlayer(this);
            return countMatches - removedMatches;
        } else {
            removedMatches = 1;
            computerPrintService.printCurrentPlayer(this);
            return countMatches - removedMatches;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}

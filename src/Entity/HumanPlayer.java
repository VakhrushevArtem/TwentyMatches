package Entity;

import Services.SimplePrintService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanPlayer implements Player {
    private String name;
    private SimplePrintService humanPrintService = new SimplePrintService();

    public HumanPlayer() {
        System.out.print("Введите ваше имя: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int move(int countMatches) {
        int removedMatches = 0;
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                humanPrintService.printCurrentPlayer(this);
                removedMatches = Integer.parseInt(reader.readLine());
                if (removedMatches <= 0 || removedMatches > 3 || removedMatches >= countMatches) {
                    humanPrintService.printInvalidMoveHumanPlayer();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (removedMatches <= 0 || removedMatches > 3);
        return countMatches - removedMatches;
    }

    @Override
    public String getName() {
        return name;
    }
}

package Games;

import Model.GameModel;
import java.util.Random;
import java.util.Scanner;


public class MiniLotek implements GameModel {

    @Override
    public int[] givenNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] selectedNumbers = new int[6];
        int counter = 1;
        boolean error = true;
        int temp = 0;
        for (int i = 0; i < selectedNumbers.length; i++) {
            System.out.println("Please provide " + counter + " number:");
            do {
                if (scanner.hasNextInt()) {
                    temp = scanner.nextInt();
                    if (temp > 99 || temp <= 0) {
                        error = true;
                        System.out.println("Out of range. Please try again: ");
                    } else
                        error = false;
                } else
                    System.out.println("This is not a number. Please try again: ");
                scanner.nextLine();
            } while (error);
            selectedNumbers[i] = temp;
            counter++;
            error = true;
        }
        scanner.close();
        return selectedNumbers;
    }

    @Override
    public int[] draw() {
        int[] drawnNumbers = new int[6];
        int min = 1;
        int max = 99;
        Random rand = new Random(); // pseudolosowe
        for (int i = 0; i < drawnNumbers.length; i++) {
            drawnNumbers[i] = rand.nextInt(max - min) + min;
        }
        return drawnNumbers;
    }

    @Override
    public void checkIfYouWon(int[] selectedNumbers, int[] drawnNumbers) {
        System.out.println("Numbers won : ");
        for (int tab : drawnNumbers) {
            System.out.println(tab);
        }
        System.out.println("You selected numbers: ");
        for (int tab : selectedNumbers) {
            System.out.println(tab);
        }

        int searchingValue = 0;
        int[] winnerArray = new int[6];

        for (int i = 0; i < selectedNumbers.length; i++) {
            searchingValue = selectedNumbers[i];
            for (int j = 0; j < drawnNumbers.length; j++) {
                if (searchingValue == drawnNumbers[j]) {
                    winnerArray[i] = drawnNumbers[j];
                }
            }
        }
        System.out.println("The winning numbers that match yours:");
        for (int i = 0; i < winnerArray.length; i++) {
            if (winnerArray[i] >= 1) {
                System.out.println(winnerArray[i]);
            }
        }
        if (winnerArray[5] >= 1) {
            System.out.println("WIN!");
        } else
            System.out.println("You did not guess the 6 winning numbers.");
    }

}

package games.lotto;

import java.util.Set;

public class CheckIfYouWon {

    public void checkIfYouWon(Set<Integer> selectedNumbers, Set<Integer> drawnNumbers) {
        System.out.println("You selected numbers: ");
        for (Integer s : selectedNumbers) {
            System.out.println(s);
        }

        System.out.println("Numbers won : ");
        for (Integer s : drawnNumbers) {
            System.out.println(s);
        }

        System.out.println("The winning numbers that match yours: ");
        selectedNumbers.retainAll(drawnNumbers);
        if (selectedNumbers.isEmpty()) {
            System.out.println("NO NUMBERS");
        } else
            System.out.println(selectedNumbers);

        if (selectedNumbers.size() == 6) {
            System.out.println("WIN!");
        } else {
            System.out.println("You did not guess the 6 winning numbers.");
        }
    }
}

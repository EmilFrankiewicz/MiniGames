package games.lotto;

import java.util.Set;

import static games.lotto.LottoGameConfiguration.NUMBERS_TO_GENERATE;
import static games.lotto.MessageProvider.*;

public class CheckIfYouWon {

    public String checkIfYouWon(Set<Integer> selectedNumbers, Set<Integer> drawnNumbers) {
        System.out.println(SELECTED_NUMBERS);
        for (Integer s : selectedNumbers) {
            System.out.println(s);
        }

        System.out.println(DRAWN_NUMBERS);
        for (Integer s : drawnNumbers) {
            System.out.println(s);
        }

        System.out.println(MATCHING_NUMBERS);
        selectedNumbers.retainAll(drawnNumbers);
        if (selectedNumbers.isEmpty()) {
            System.out.println(NO_NUMBERS);
        } else
            System.out.println(selectedNumbers);

        if (selectedNumbers.size() == NUMBERS_TO_GENERATE) {
            return WIN_MESSAGE;
        } else {
            return LOSE_MESSAGE;
        }
    }
}

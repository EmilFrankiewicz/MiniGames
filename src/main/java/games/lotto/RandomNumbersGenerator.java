package games.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static games.lotto.LottoGameConfiguration.*;

public class RandomNumbersGenerator {

    public Set<Integer> draw() {
        Random rand = new Random();
        Set<Integer> drawnNumbers = new HashSet<>();
        while (drawnNumbers.size() < HOW_MANY_NUMBERS_FROM_USER) {
            drawnNumbers.add(rand.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND);
        }
        return drawnNumbers;
    }
}

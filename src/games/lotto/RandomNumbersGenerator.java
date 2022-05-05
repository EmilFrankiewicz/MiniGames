package games.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbersGenerator {

    public Set<Integer> draw(int howMuchRandomNumbers) {
        int min = 1;
        int max = 99;
        Random rand = new Random();
        Set<Integer> drawnNumbers = new HashSet<>();
        while (drawnNumbers.size() < howMuchRandomNumbers) {
            drawnNumbers.add(rand.nextInt(max - min) + min);
        }
        return drawnNumbers;
    }
}

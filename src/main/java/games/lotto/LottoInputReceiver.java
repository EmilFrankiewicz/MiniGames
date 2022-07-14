package games.lotto;

import games.exceptions.NotANumberException;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static games.lotto.LottoGameConfiguration.*;
import static games.lotto.MessageProvider.*;

public class LottoInputReceiver {

    private int numberToAdd;

    public void setAge(int numberToAdd) {
        this.numberToAdd = numberToAdd;
    }

    public Set<Integer> retrieveNumbersFromUser(Scanner scanner) {
        Set<Integer> selectedNumbers = new HashSet<>();

        while (selectedNumbers.size() < NUMBERS_TO_GENERATE) {
            int size = selectedNumbers.size() + 1;
            System.out.println(PROVIDE_NUMBER + size);

            if (validateException(scanner, numberToAdd)) {
                {
                    validateNumbers(selectedNumbers, numberToAdd);
                    scanner.nextLine();
                    continue;
                }
            }
            scanner.nextLine();
            selectedNumbers.add(numberToAdd);
            size++;
        }
        scanner.close();
        return selectedNumbers;
    }

    public void validateNumbers(Set<Integer> selectedNumbers, int numberToAdd) {
        if (isInRange(numberToAdd)) {
            selectedNumbers.add(numberToAdd);
        } else System.out.println(OUT_OF_RANGE);
    }

    public boolean validateException(Scanner scanner, int numberToAdd) {
        try {
            numberToAdd = scanner.nextInt();
        } catch (Exception e) {
            throw new NotANumberException(NOT_A_NUMBER);
        }
        setAge(numberToAdd);
        return true;
    }

    public boolean isInRange(int numberToAdd) {
        return numberToAdd >= LOWER_BOUND && numberToAdd <= UPPER_BOUND;
    }
}

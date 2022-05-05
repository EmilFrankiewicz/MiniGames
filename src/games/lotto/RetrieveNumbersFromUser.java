package games.lotto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RetrieveNumbersFromUser {

    public Set<Integer> retrieveNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> selectedNumbers = new HashSet<>();
        int numberToAdd = 0;

        while (selectedNumbers.size() < 6) {
            int size = selectedNumbers.size() + 1;
            System.out.println("Please provide " + size + " number:");
            if (scanner.hasNextInt()) {
                numberToAdd = scanner.nextInt();
                if (numberToAdd > 99 || numberToAdd <= 0) {
                    System.out.println("Out of range. Please try again: ");
                    scanner.nextLine();
                    continue;
                }
                scanner.nextLine();
                selectedNumbers.add(numberToAdd);
                size++;
            }
        }
        scanner.close();
        return selectedNumbers;
    }
}

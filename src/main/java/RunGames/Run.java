package RunGames;

import games.lotto.CheckIfYouWon;
import games.lotto.RandomNumbersGenerator;
import games.lotto.LottoInputReceiver;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        CheckIfYouWon check = new CheckIfYouWon();
        LottoInputReceiver retrieve = new LottoInputReceiver();
        RandomNumbersGenerator rand = new RandomNumbersGenerator();
        Scanner scanner = new Scanner(System.in);
   check.checkIfYouWon(retrieve.retrieveNumbersFromUser(scanner),rand.draw());

    }
}

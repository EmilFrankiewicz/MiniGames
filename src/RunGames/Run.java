package RunGames;

import games.lotto.CheckIfYouWon;
import games.lotto.RandomNumbersGenerator;
import games.lotto.RetrieveNumbersFromUser;

public class Run {

    public static void main(String[] args) {
        CheckIfYouWon check = new CheckIfYouWon();
        RetrieveNumbersFromUser retrive = new RetrieveNumbersFromUser();
        RandomNumbersGenerator rand = new RandomNumbersGenerator();
        check.checkIfYouWon(retrive.retrieveNumbersFromUser(),rand.draw(6));
    }
}

package games.lotto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class CheckIfYouWonTest {

    @Test
    public void selectedNumbersShouldShowWinningInscription()
    {
        //given
        Set<Integer> selectedNumbers = new HashSet<>();
        selectedNumbers.addAll(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> drawnNumbers = new HashSet<>();
        drawnNumbers.addAll(Arrays.asList(1,2,3,4,5,6));
        CheckIfYouWon checker = new CheckIfYouWon();

        //when
     String messageToShow =   checker.checkIfYouWon(selectedNumbers, drawnNumbers);

        //then
        Assertions.assertEquals("YOU WIN!", messageToShow);
    }

    @Test
    public void selectedNumbersShouldShowLosingInscription()
    {
        //given
        Set<Integer> selectedNumbers = new HashSet<>();
        selectedNumbers.addAll(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> drawnNumbers = new HashSet<>();
        drawnNumbers.addAll(Arrays.asList(10,20,30,40,50,60));
        CheckIfYouWon checker = new CheckIfYouWon();

        //when
        String messageToShow =   checker.checkIfYouWon(selectedNumbers, drawnNumbers);

        //then
        Assertions.assertEquals("You did not guess the 6 winning numbers.", messageToShow);
    }
}
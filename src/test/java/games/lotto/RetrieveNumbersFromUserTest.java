package games.lotto;

import games.exceptions.NotANumberException;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static games.lotto.MessageProvider.NOT_A_NUMBER;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;

class RetrieveNumbersFromUserTest {


    @Test
    public void should_Throw_NotANumberExceptionException_When_User_Provide_Character_Instead_Number() {
        //given
        LottoInputReceiver receiver = new LottoInputReceiver();
        String input = "qwerty";
        String errorMessage = NOT_A_NUMBER;
        Scanner scanner = mockScannerIn(input);

        //when
        Throwable thrown = catchThrowable(() -> receiver.retrieveNumbersFromUser(scanner));

        //then
        assertThat(thrown).isInstanceOf(NotANumberException.class).hasMessageContaining(errorMessage);
    }

    private Scanner mockScannerIn(String data) {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);
        return scanner;
    }
}
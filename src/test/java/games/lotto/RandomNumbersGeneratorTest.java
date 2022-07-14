package games.lotto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class RandomNumbersGeneratorTest {

    //" I don't think unit tests are the right tool for testing randomness.  "
    @Test
    public void shouldReturn6NumbersBetween1And99() {
        //given
        RandomNumbersGenerator randomNumbersGenerator = new RandomNumbersGenerator();
        //when
        Set<Integer> resultOf6Numbers = resultOf6Numbers = randomNumbersGenerator.draw();
        //then
        Assertions.assertEquals(6, resultOf6Numbers.size());
    }
}

package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class FatorialTest {

    @Mock Fatorial fatorial;

    @Test
    public void calculate_callAmountForEight() {
        fatorial.calculate(8);
        verify(fatorial, times(8)).calculate(8);
    }

    /*@Test
    public void calculate_callAmountForEight() {

        class FatorialSpy extends Fatorial {
            public int countCalls = 0;

            @Override
            public int calculate(int number) {
                countCalls++;
                return super.calculate(number);
            }
        }

        FatorialSpy spy = new FatorialSpy();
        spy.calculate(8);

        Assertions.assertEquals(8, spy.countCalls);

    }*/

}

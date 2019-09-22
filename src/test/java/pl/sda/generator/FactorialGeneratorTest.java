package pl.sda.generator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class FactorialGeneratorTest {

    private Generator generator;

    @Before
    public void setUp() {
        generator = new FactorialGenerator();
    }

    @Test
    public void shouldReturn720At7thAttempt() {
        //given
        final int attempts = 7;
        final BigDecimal expectedResult = new BigDecimal(720);

        //when
        BigDecimal result = null;
        for (int i = 1; i <= attempts; i++) {
            result = generator.next();
        }

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn5040At8thAttempt() {
        //given
        final int attempts = 8;
        final BigDecimal expectedResult = new BigDecimal(5040);

        //when
        BigDecimal result = null;
        for (int i = 1; i <= attempts; i++) {
            result = generator.next();
        }

        //then
        assertEquals(expectedResult, result);
    }
}
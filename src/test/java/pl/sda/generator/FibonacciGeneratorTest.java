package pl.sda.generator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FibonacciGeneratorTest {

    private Generator generator;

    @Before
    public void setUp() {
        generator = new FibonacciGenerator();
    }

    @Test
    public void shouldReturn5At5thCall() {
        //given
        final int attempts = 5;
        final BigDecimal expectedResult = new BigDecimal(5);

        //when
        BigDecimal result = null;
        for (int i = 1; i <= attempts; i++) {
            result = generator.next();
        }

        //then
        assertNotNull(result);
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn0At1stCall() {
        //given
        final int attempts = 1;
        final BigDecimal expectedResult = new BigDecimal(0);

        //when
        BigDecimal result = null;
        for (int i = 1; i <= attempts; i++) {
            result = generator.next();
        }

        //then
        assertNotNull(result);
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn1At2ndCall() {
        //given
        final int attempts = 2;
        final BigDecimal expectedResult = new BigDecimal(1);

        //when
        BigDecimal result = null;
        for (int i = 1; i <= attempts; i++) {
            result = generator.next();
        }

        //then
        assertNotNull(result);
        assertEquals(expectedResult, result);
    }
}
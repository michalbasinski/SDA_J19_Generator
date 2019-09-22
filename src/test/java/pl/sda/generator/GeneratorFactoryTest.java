package pl.sda.generator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratorFactoryTest {

    private GeneratorFactory factory = new GeneratorFactory();

    @Test
    public void shouldProduceFibonacciGenerator() {
        //given
        final GeneratorType type = GeneratorType.FIBONACCI;

        //when
        Generator result = factory.produce(type);

        //then
        assertTrue(result instanceof Generator);
        assertTrue(result instanceof FibonacciGenerator);
        assertFalse(result instanceof FactorialGenerator);
    }

    @Test
    public void shouldProduceFactorialGenerator() {
        //given
        final GeneratorType type = GeneratorType.FACTORIAL;

        //when
        Generator result = factory.produce(type);

        //then
        assertTrue(result instanceof Generator);
        assertFalse(result instanceof FibonacciGenerator);
        assertTrue(result instanceof FactorialGenerator);
    }
}
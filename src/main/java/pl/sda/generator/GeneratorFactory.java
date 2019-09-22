package pl.sda.generator;

public class GeneratorFactory {
    public Generator produce(GeneratorType type) {
        Generator result = null;
        if (GeneratorType.FACTORIAL.equals(type)) {
            result = new FactorialGenerator();
        }
        if (GeneratorType.FIBONACCI.equals(type)) {
            result = new FibonacciGenerator();
        }
        return result;
    }
}

package pl.sda.generator;

import java.math.BigDecimal;

public class FactorialGenerator implements Generator {

    private int n = 0;
    private BigDecimal current;

    @Override
    public BigDecimal next() {
        if (n == 0) {
            current = new BigDecimal(1);
            n++;
        } else {
            current = current.multiply(new BigDecimal(n));
            n++;
        }
        return current;
    }
}
